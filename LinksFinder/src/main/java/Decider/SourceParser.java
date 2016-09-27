package Decider;

import java.util.regex.Pattern;


public class SourceParser {
    private String givenSource;

    public SourceParser(String givenSource) {
        this.givenSource = givenSource;
    }

    public boolean isURL(){
        String urlRegularExpression = "http:\\/\\/www\\..+\\.[a-zA-Z]{2,3}(\\/.*)*";
        return Pattern.matches(urlRegularExpression, givenSource);
    }
    public boolean isFilepath(){
        String pathRegularExpression = "[a-zA-Z]?:?(\\\\.+)*\\.html";
        return Pattern.matches(pathRegularExpression, givenSource);
    }
}
