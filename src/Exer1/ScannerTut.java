package Exer1;

//detta är för att få information till vår scanner.
import java.util.Scanner;

public class ScannerTut {
    public static void main(String[] args) {

        //declaring an object. Scanner är ett object som är skapat för att läsa input streams från
        //konsolen och det kan den göra genom system.in. hela kodraden Scanner scan = new Scanner(System.in)
        //skapar ett objekt från scanner klassen i java. Scanner objectet blir i denna instans tilldelad variabeln
        //scan. Denna scan variabel kan nu användas för att läsa olika inputs från konsolen med hjälp av methods
        //från scanner klassen som t.ex scan.next();, scan.nextInt(); osv.
       Scanner scan = new Scanner(System.in);

        System.out.println("Hey dude, what's your first name?");
        String name = scan.next();

        System.out.println("What's your age?");
        int age = scan.nextInt();

        System.out.println("What's your senior quote?");
        String quote = scan.next();
        quote = quote + scan.nextLine();

        System.out.println("Thank you " + name + ", you are " + age + " years old");
        System.out.println("and your senior quote is " + quote);
    }
}
