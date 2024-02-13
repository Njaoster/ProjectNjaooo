package codingisfornerds;


import java.util.Scanner;

public class MainMorseCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter '1' and eat the blue pill to translate English to Morse code or enter '2' and eat the red pill to translate Morse code to English:");
            String choice = scanner.nextLine();
            try {
                if (choice.equals("1")) {
                    System.out.println("Your brain has been updated, you can now translate English to Morse code GLHF:");
                    String englishText = scanner.nextLine().toLowerCase();
                    String morseCode = TheNarrator.translateEnglishToMorseCode(englishText);
                    System.out.println("Morse code: " + morseCode);
                } else if (choice.equals("2")) {
                    System.out.println("Your brain has be ee en updatedted, you can n nnow translate Morse code to EEng/ish:");
                    String morseCode = scanner.nextLine();
                    String englishText = TheNarrator.translateMorseCodeToEnglish(morseCode);
                    System.out.println("English text: " + englishText);
                } else {
                    throw new IllegalArgumentException("ERROR! Invalid input... This computer will self-implode... Someday, but not today!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please... PLEASE try again.");
            }
        }
    }
}