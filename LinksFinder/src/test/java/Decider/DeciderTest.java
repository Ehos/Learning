package Decider;

import Readers.FileReader;
import Readers.Reader;
import Readers.URLReader;
import org.junit.Assert;
import org.junit.Test;

public class DeciderTest {

    @Test
    public void shouldReturnURLReader(){
        Decider decider = new Decider("http://www.strona.com/podstrona/podstrona.html");
        Reader reader = decider.getReader();

        Assert.assertTrue(reader instanceof URLReader);
        Assert.assertFalse(reader instanceof FileReader);
        Assert.assertNotNull(reader);
    }

    @Test
    public void shouldReturnFileReader(){
        Decider decider = new Decider("c:\\plik\\plik.html");
        Reader reader = decider.getReader();

        Assert.assertFalse(reader instanceof URLReader);
        Assert.assertTrue(reader instanceof FileReader);
        Assert.assertNotNull(reader);
    }

    @Test
    public void shouldReturnNull(){
        Decider decider = new Decider("ghdgf");
        Reader reader = decider.getReader();

        Assert.assertFalse(reader instanceof URLReader);
        Assert.assertFalse(reader instanceof FileReader);
        Assert.assertNull(reader);
    }
}
