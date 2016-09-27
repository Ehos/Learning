package Decider;

import Readers.FileReader;
import Readers.Reader;
import Readers.URLReader;


public class Decider {
    private String sourceAddress;

    public Decider(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public Reader getReader (){
        SourceParser sourceParser = new SourceParser(sourceAddress);
        if(sourceParser.isFilepath()){
            return new FileReader(sourceAddress);
        }
        if (sourceParser.isURL()){
            return new URLReader(sourceAddress);
        }

        return null;
    }
}
