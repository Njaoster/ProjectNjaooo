package codingleavesthesouldry;

import java.util.Scanner;
public class MyTextScanner
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String input = "";

        MyCounter countRows = new MyCounter();

        System.out.print("Dear alien write some text please =) : ");

        while (!input.equals("stop"))
        {
            input = scan.nextLine();
            if (!input.equals("stop"))

            {
                countRows.counter(input);
            }

        }
        System.out.println("Congratulation you wrote this many rows of text: " + countRows.getRows());
        System.out.println("Well done you wrote this many characters: " + countRows.getCharacters());{
        System.out.println("Unfortunately we didn't like what you wrote... So MIB will be with you shortly, jaa ne!");
        }
    }
}