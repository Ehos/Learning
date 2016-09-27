package Decider;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Patryk95 on 2016-09-26.
 */
public class SourceParserTest {

    @Test
    public void givenCorrectURLShouldReturnTrue(){
        SourceParser sourceParserWWW = new SourceParser("www.strona.com/podstrona/podstrona.html");
        SourceParser sourceParserHTTP = new SourceParser("http://www.strona.com/podstrona");
        SourceParser sourceParserHTTPS = new SourceParser("https://www.strona.com/podstrona.html");

        Assert.assertTrue(sourceParserHTTP.isURL());
        Assert.assertTrue(sourceParserHTTPS.isURL());
        Assert.assertTrue(sourceParserWWW.isURL());
    }

    @Test
    public void givenCorrectFilepathShouldReturnTrue(){
        SourceParser sourceParserRelativePath = new SourceParser("c:\\plik\\plik.html");
        SourceParser sourceParserAbsolutePath = new SourceParser("\\plik\\plik\\plik.html");
        SourceParser shortSourceParserAbsolutePath = new SourceParser("c:\\plik.html");
        SourceParser shortSourceParserRelativePath = new SourceParser("\\plik.html");

        Assert.assertTrue(sourceParserRelativePath.isFilepath());
        Assert.assertTrue(sourceParserAbsolutePath.isFilepath());
        Assert.assertTrue(shortSourceParserAbsolutePath.isFilepath());
        Assert.assertTrue(shortSourceParserRelativePath.isFilepath());
    }

    @Test
    public void givenWrongFilepathShouldReturnFalse(){
        SourceParser sourceParserWrongPath = new SourceParser("kajf0435]\\[;adsf");
        SourceParser sourceParserRelativePath = new SourceParser("c:\\plik\\plik");
        SourceParser sourceParserAbsolutePath = new SourceParser("\\plik\\plik\\plik.exe");
        SourceParser shortSourceParserAbsolutePath = new SourceParser("c:\\plik");
        SourceParser shortSourceParserRelativePath = new SourceParser("http://www.strona.com/podstrona.html");

        Assert.assertFalse(sourceParserWrongPath.isFilepath());
        Assert.assertFalse(sourceParserRelativePath.isFilepath());
        Assert.assertFalse(sourceParserAbsolutePath.isFilepath());
        Assert.assertFalse(shortSourceParserAbsolutePath.isFilepath());
        Assert.assertFalse(shortSourceParserRelativePath.isFilepath());
    }

    @Test
    public void givenWrongURLShouldReturnFalse() {
        SourceParser sourceParserWrongWWW = new SourceParser("wwww.strona.com/podstrona/podstrona.html");
        SourceParser sourceParserWrongHTTP = new SourceParser("http://www.strona.c/podstrona");
        SourceParser sourceParserWrongHTTPS = new SourceParser("https://www.strona.commm/podstrona.html");
        SourceParser sourceParserWrongURL = new SourceParser("kajf0435]\\[;adsf");
        SourceParser sourceParserWrong = new SourceParser("http://www.pl");

        Assert.assertFalse(sourceParserWrongWWW.isURL());
        Assert.assertFalse(sourceParserWrongHTTP.isURL());
        Assert.assertFalse(sourceParserWrongHTTPS.isURL());
        Assert.assertFalse(sourceParserWrongURL.isURL());
        Assert.assertFalse(sourceParserWrong.isURL());
    }
}
