package LinksFinder;

import org.junit.Assert;
import org.junit.Test;

public class LinksFinderTest {

    @Test
    public void whenLineStartsWithLink(){
        LinksFinder linksFinder = new LinksFinder();
        Assert.assertEquals("http:/page.pl/somepage",linksFinder.lookForLink("<a href=\"http:/page.pl/somepage\"> something something"));
    }

    @Test
    public void whenLineEndsWithLink(){
        LinksFinder linksFinder = new LinksFinder();
        Assert.assertEquals("http:/page.pl/somepage",linksFinder.lookForLink("something something <a href=\"http:/page.pl/somepage\">"));
    }

    @Test
    public void whenLinkIsInTheMiddleOfLine(){
        LinksFinder linksFinder = new LinksFinder();
        Assert.assertEquals("http:/page.pl/somepage",linksFinder.lookForLink("something something <a href=\"http:/page.pl/somepage\"> something something"));
    }

    @Test
    public void whenLineContainsOnlyLink(){
        LinksFinder linksFinder = new LinksFinder();
        Assert.assertEquals("http:/page.pl/somepage",linksFinder.lookForLink("<a href=\"http:/page.pl/somepage\">"));
    }

    @Test
    public void whenLineHasNotLink(){
        LinksFinder linksFinder = new LinksFinder();
        Assert.assertEquals(null,linksFinder.lookForLink("something something something"));
    }

}
