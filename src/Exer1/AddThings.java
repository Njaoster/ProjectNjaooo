package Exer1;

import java.util.Scanner;

public class AddThings {
    public static void main(String[] args) {

        //Scanner är en klass som skapar ett objekt som som skapar methoder att läsa från consolen.
        //sout är bara ett verktyg som berättar vad vi ska göra.
        //för att få scannern att funka måste vi sägga åt den vad den ska göra i detta fall
        //läsa av en siffra i konsolen. därav int a = scan.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a dang good number:");
        int a = scan.nextInt();

        System.out.println("Enter another dang good number:");
        int b = scan.nextInt();

        System.out.println("Then we get:");
        System.out.println(a + b);

    }
}
