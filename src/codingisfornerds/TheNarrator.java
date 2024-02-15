package codingisfornerds;

public class TheNarrator {

    private static final String[] English_Symbols = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ",", ".", "?", " "};

    private static final String[] Morse_Code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-", "..--..", " "};

    public static String translateEnglishToMorseCode(String englishText) {
        StringBuilder morseCode = new StringBuilder();
        for (char c : englishText.toLowerCase().toCharArray()) {
            int index = getIndex(English_Symbols, c);
            if (index != -1) {
                morseCode.append(Morse_Code[index]).append(" ");
            } else {
                throw new IllegalArgumentException("SYNTAX ERROR: Symbol not found. Agent Smith is on his way!: " + c);
            }
        }
        return morseCode.toString().trim();
    }


    public static String translateMorseCodeToEnglish(String morseCode) {
        StringBuilder englishText = new StringBuilder();
        String[] morseWords = morseCode.trim().split(" ");
        for (String morseWord : morseWords) {
            if (!morseWord.isEmpty()) {
                int index = getIndex(Morse_Code, morseWord);
                if (index != -1) {
                    englishText.append(English_Symbols[index]);
                } else {
                    throw new IllegalArgumentException("SYNTAX ERROR: Symbol not found in Morse code DUH!: " + morseWord);
                }
            } else {
                englishText.append(" ");
            }
        }
        return englishText.toString();
    }



    private static int getIndex(String[] array, char c) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == c) {
                return i;
            }
        }
        return -1;
    }

    private static int getIndex(String[] array, String s) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
}


