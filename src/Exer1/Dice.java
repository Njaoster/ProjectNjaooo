package Exer1;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        //ett rand objekt skapas med konstruktorn.
        Random rand = new Random();
        //metoden nextint(6) kallar på rand objektet vilket returnar ett random värde mellan 0 och 5 för att vi skrev (6)
        //pga java blir det 0-5... därför måste vi lägga till + 1. resultatet sparas i vår int x.
        int x = rand.nextInt(6) + 1;

        //sout skriver sedan ut text och kallar på all information som finns i variabeln x
        System.out.println("You rolled a: " + x);


    }
}
