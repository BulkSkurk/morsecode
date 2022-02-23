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
        String expected = "B K";
        assertEquals(expected, actual);
    }

    @Test
    public void testDataRemoverTranslated()
    //Tests if Data is properly removed from Translated ArrayLists.
    {
        //Arrange
        String morseInputTest = "-*** -*-";
        MorseLogic morse = new MorseLogic();
        //Act
        morse.codeSplitter(morseInputTest);
        morse.hashListGetter();
        morse.dataRemover();
        String actual = morse.arrayLetterListPrinter();

        //Assert
        String expected = "";
        assertEquals(expected, actual);
    }
    @Test
    public void testDataRemoverunTranslated()
    //Tests if Data is properly removed from unTranslated ArrayLists.
    {
        //Arrange
        String morseInputTest = "-*** -*-";
        MorseLogic morse = new MorseLogic();
        //Act
        morse.codeSplitter(morseInputTest);
        morse.hashListGetter();
        morse.dataRemover();
        String actual = morse.arrayMorseListPrinter();

        //Assert
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void testIndexPrinter()
    //Tests if the index printer method prints the correct String.
    {
        //Arrange
        String morseInputTest = "-*** -*-";
        MorseLogic morse = new MorseLogic();
        //Act
        morse.codeSplitter(morseInputTest);
        morse.hashListGetter();
        String actual = morse.indexGetter(Integer.parseInt("1"));

        //Assert
        String expected = "K";
        assertEquals(expected, actual);
    }
    @Test
    public void testFaultyInput()
    //Tests if saving is properly done when receiving faulty input resulting in a null value
            //being returned from the hashmap.
    {
        //Arrange
        String morseInputTest = "-*** ASD";
        MorseLogic morse = new MorseLogic();
        //Act
        morse.codeSplitter(morseInputTest);
        morse.hashListGetter();
        String actual = morse.arrayLetterListPrinter();

        //Assert
        String expected = "B";
        assertEquals(expected, actual);
    }


}
