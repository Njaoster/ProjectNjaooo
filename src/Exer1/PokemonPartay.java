package Exer1;

import java.util.Scanner;

public class PokemonPartay {
    public static void main(String[] args) {

        //Scanner skapar ett nytt objekt i klassen java. Scanner läser av input från consolen. utan scanner
        //kan man inte skriva in consolen. System.in pekar på att input data kommer att komma från consolen.
        Scanner scan = new Scanner(System.in);

        //sout säger bara att skriv en pokemon. med den andra koden string pokemon1 så lagras det som skrivs.
        //i variabeln pokemon 1,2,3 osv. utan det som kommer efter så kan man inte skriva alls = scan.nextLine();
        //så man måste ha någonting t.ex scan.nextLine för att scannern ska fungera fullt ut.
        System.out.println("Enter pokemon 1:");
        String pokemon1 = scan.nextLine();

        System.out.println("Enter pokemon 2:");
        String pokemon2 = scan.nextLine();

        System.out.println("Enter pokemon 3:");
        String pokemon3 = scan.nextLine();

        System.out.println("Enter pokemon 4:");
        String pokemon4 = scan.nextLine();

        System.out.println("Enter pokemon 5:");
        String pokemon5 = scan.nextLine();

        System.out.println("Enter pokemon 6:");
        String pokemon6 = scan.nextLine();

        //här skriver vi bara ut alla variablar för att visa vad du lagrat.
        System.out.println("Here are your fluffyduffy pokemons! GLHF =D");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);
        System.out.println(pokemon5);
        System.out.println(pokemon6);
    }
}
