package Readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Patryk95 on 2016-09-26.
 */
public abstract class Reader {
    protected String sourceAddress;

    public Reader(String sourceAddress){
        this.sourceAddress=sourceAddress;
    }

    public ArrayList<String> getStringsSource(){
        ArrayList<String> stringsSource = new ArrayList<String>();
        String currentLine;

        BufferedReader bufferedReader = getStreamFromAddress();

        try {
            while ((currentLine = bufferedReader.readLine())!=null){
                stringsSource.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringsSource;
    }
    protected abstract BufferedReader getStreamFromAddress();

}
