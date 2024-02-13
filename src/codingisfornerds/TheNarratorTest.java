package codingisfornerds;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TheNarratorTest {

    @Test
    public void testTranslateEnglishToMorseCode() {
        String englishText = "cat says meow";
        String expectedMorseCode = "-.-. .- -   ... .- -.-- ...   -- . --- .--";
        assertEquals(expectedMorseCode, TheNarrator.translateEnglishToMorseCode(englishText).trim());
    }

    @Test
    public void testTranslateMorseCodeToEnglish() {
        String morseCode = "-- . --- .--  ... .- -.-- ...  - .... .  -.-. .- -";
        String expectedEnglishText = "meow says the cat";
        assertEquals(expectedEnglishText, TheNarrator.translateMorseCodeToEnglish(morseCode).trim());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSymbolInMorseCode() {
        String morseCode = "$";
        TheNarrator.translateMorseCodeToEnglish(morseCode);
    }
}
