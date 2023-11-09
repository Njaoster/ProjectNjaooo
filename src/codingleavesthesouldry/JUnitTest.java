package codingleavesthesouldry;

import codingleavesthesouldry.MyCounter;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class JUnitTest
{
    @Test
    public void firstTestCase()
    {
        MyCounter newCounter = new MyCounter(6,20);

        int newChar = newCounter.getCharacters();

        int actual = newChar;
        int expected = 20;

        assertEquals(expected, actual);

    }

    @Test
    public void secondTestCase()
    {
        MyCounter newCounter = new MyCounter(6,20);

        int newRows = newCounter.getRows();
        int actual = newRows;
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void thirdTestCase()
    {
        MyCounter newCounter = new MyCounter();

        newCounter.counter("Hey");
        newCounter.counter("Dude");

        int newRows = newCounter.getRows();
        int actual = newRows;
        int expected = 2;

        assertEquals(expected, actual);
    }
}

