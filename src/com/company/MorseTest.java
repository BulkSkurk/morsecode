package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MorseTest {
    @Test
            public void testMorsetoLetter()
            //Tests a single letter conversion to morse code.
    {
        //Arrange
        String morseInputTest = "A";
        MorseLogic morse = new MorseLogic();
        //Act

        String actual = morse.convertMap(morseInputTest);

        //Assert
        String expected = "*-";
        assertEquals(expected, actual);
    }
    @Test
    public void testLetterToMorse()
    //Tests a single morse conversion to letter.
    {
        //Arrange
        String morseInputTest = "-***";
        MorseLogic morse = new MorseLogic();
        //Act

        String actual = morse.convertMap(morseInputTest);

        //Assert
        String expected = "B";
        assertEquals(expected, actual);
    }
    @Test
    public void testMorsetoMoreLetters()
    //Tests two morse codes separated by space conversion to letters.
    {
        //Arrange
        String morseInputTest = "-*** -*-";
        MorseLogic morse = new MorseLogic();
        //Act
        morse.codeSplitter(morseInputTest);
        morse.hashListGetter();
        String actual = morse.arrayLetterListPrinter();

        //Assert
        String expected = "BK";
        assertEquals(expected, actual);
    }
}
