package codingleavesthesouldry;

import codingleavesthesouldry.MyCounter;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class JUnitTest
{
    @Test
    public void firstTestCase()
    {
        //här skapas ett object av klassen mycounter som har 6 rader och 20 characters.
        MyCounter newCounter = new MyCounter(6,20);

        //tilldelar min interna varaiabel newChar med värdet från fältet character från objektet newCounter.
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

        //skillnaden är att vi nu kör metoden Counter för att se om increment fungerar i metoden för rad.
        newCounter.counter("Hey");
        newCounter.counter("Dude");

        int newRows = newCounter.getRows();
        int actual = newRows;
        int expected = 2;

        assertEquals(expected, actual);
    }
}
 /* Arrange/ACT/Assert
            ordning och reda på testfalen

            Arrange
                vilka värden ska vi testa mot testdata
                var börjar vi
            Act
                Själva beräkningen av klassen vi ska testa
                sparar resultatet
            Assert
                Jämför om vi fick rätt resultat

                Alltså
                    Arrange: Testa metoden t.ex. Calculator calc = new Calculator(2, 3); som ska testas + int expected.
                    Act: int actual = calc.add(); göra beräkningen testet.
                    Assert: och sist assertEquals(expected, actual)

                    man kan testa allt, hur många characters, rows, username, password, nåt som testar true eller false
                    från en metod osv.
         */
