package LinksFinder;

import Decider.Decider;
import Readers.FileReader;
import Readers.Reader;
import Readers.URLReader;

import java.util.ArrayList;

/**
 * Created by Patryk95 on 2016-09-27.
 */
public class LinksManager {
    private String sourceAddress;

    public LinksManager(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public ArrayList<String> getArrayOfLinks(){
        LinksFinder linksFinder = new LinksFinder();
        ArrayList<String> source;
        ArrayList<String> links = new ArrayList<String>();
        Decider decider = new Decider(sourceAddress);
        Reader reader = decider.getReader();
        System.out.println(reader instanceof FileReader);
        if(!reader.equals(null)){
        System.out.println(reader instanceof URLReader);
            source = reader.getStringsSource();
            for(int i=0; i<source.size(); i++){
                String link = linksFinder.lookForLink(source.get(i));
                if(link!=null){
                    links.add(link);
                }
            }
        }
        return links;
    }

}
