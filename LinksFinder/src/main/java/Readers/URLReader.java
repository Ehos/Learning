package Readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Patryk95 on 2016-09-26.
 */
public class URLReader extends Reader{

    public URLReader(String sourceAddress) {
        super(sourceAddress);
    }

    protected BufferedReader getStreamFromAddress() {

        URL address = null;
        try {
            address = new URL(sourceAddress);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(address.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bufferedReader;
    }
}
