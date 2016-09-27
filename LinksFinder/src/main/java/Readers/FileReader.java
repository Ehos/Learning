package Readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class FileReader extends Reader {

    public FileReader(String sourceAddress) {
        super(sourceAddress);
    }

    protected BufferedReader getStreamFromAddress() {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(sourceAddress));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }
}
