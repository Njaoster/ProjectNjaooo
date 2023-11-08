package Exer1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        //enkelt program för att se vad man har för grade US...
        //massor av if if else.
        //först använder vi scanner för att få input från user sen sout för att få user ska skriva.
        //sen en massa else ifs för att se vart man hamnar på skalan.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade:");

        int n = scan.nextInt();

        if (n >= 90 && n <= 100) {

            System.out.println("A");

        } else if (n >= 80 && n < 90) {

            System.out.println("B");

        } else if (n >= 70 && n < 80) {

            System.out.println("C");

        } else if (n >= 65 && n < 70) {

            System.out.println("D");

        } else if (n >= 0 && n < 65) {

            System.out.println("F");

        } else {

            System.out.println("The number you entered is not in the range");

        }
    }

}
