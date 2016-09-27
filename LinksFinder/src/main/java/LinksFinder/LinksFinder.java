package LinksFinder;

/**
 * Created by Patryk95 on 2016-09-26.
 */
public class LinksFinder {

   // private String lineOfCode;


    public LinksFinder() {
        //this.lineOfCode = lineOfCode;
    }

    public String lookForLink(String lineOfCode){
        String link = null;
        if(hasLink(lineOfCode)){
            int startIndex = lineOfCode.indexOf("href=\"") + 6;
            int endIndex = lineOfCode.indexOf("\"", startIndex);
            link = lineOfCode.substring(startIndex, endIndex);
        }

        return link;
    }

    private boolean hasLink(String lineOfCode){

        return lineOfCode.toLowerCase().contains("href=");
    }


}
