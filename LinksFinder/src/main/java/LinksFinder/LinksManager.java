package LinksFinder;

import Decider.Decider;
import Readers.Reader;

import java.util.ArrayList;

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
        if(!reader.equals(null)){
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
