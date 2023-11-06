package codingleavesthesouldry;
//hämtar information från en inbyggd konstruktor till scanner
import java.util.Scanner;

/*public betyder att denna klass kan användas av andra klasser
class är ett blueprint för att skapa andra saker*/
public class MyTextScanner {

    /*detta är en method som är start punkten för koden - JVM
static betyder att metoden inte är en instance av en klass
utan tillhör klassen. void betyder att metoden inte skickar tillbaka värden.*/
    public static void main(String[] args) {

        //Scanner läser in all input från konsolen.
        Scanner scan = new Scanner(System.in);

        //typen String för text. variabeln input som är tom.
        String input = "";

        /*skapar en ny instance av en klass från MyCounter klassen
        som används för att räkna antal rader och tecken.*/
        MyCounter countRows = new MyCounter();

        System.out.print("Dear alien write some text please =) : ");

        //Startar en loop som läser texten som skrivs tills man skriver stop.
        while (!input.equals("stop"))
        {
            input = scan.nextLine();
            if (!input.equals("stop"))
            //För varje rad som skrivs kallar man på counter methoden
            {
                countRows.counter(input);
            }

        }
        //skriver ut det vi vill plus resultatet av hur många rader och characters.
        System.out.println("Congratulation you wrote this many rows of text: " + countRows.getRows());
        System.out.println("Well done you wrote this many characters: " + countRows.getCharacters());{
        System.out.println("Unfortunately we didn't like what you wrote... So MIB will be with you shortly, jaa ne!");
        }
    }
}