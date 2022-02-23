package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MorseLogic {

    Random rand = new Random();
    protected ArrayList<String> notTranslated = new ArrayList<String>();
    protected ArrayList<String> isTranslated = new ArrayList<String>();


    public String convertMap(String s) {
        //Contains morse-text and text-morse Hashmap.
        HashMap<String, String> morse = new HashMap<>();
        morse.put("A", "*-");
        morse.put("*-", "A");
        morse.put("B", "-***");
        morse.put("-***", "B");
        morse.put("C", "-*-*");
        morse.put("-*-*", "C");
        morse.put("D", "-**");
        morse.put("-**", "D");
        morse.put("E", "*");
        morse.put("*", "E");
        morse.put("F", "**-*");
        morse.put("**-*", "F");
        morse.put("G", "--*");
        morse.put("--*", "G");
        morse.put("H", "****");
        morse.put("****", "H");
        morse.put("I", "**");
        morse.put("**", "I");
        morse.put("J", "*---");
        morse.put("*---", "J");
        morse.put("K", "-*-");
        morse.put("-*-", "K");
        morse.put("L", "*-**");
        morse.put("*-**", "L");
        morse.put("M", "--");
        morse.put("--", "M");
        morse.put("N", "-*");
        morse.put("-*", "N");
        morse.put("O", "---");
        morse.put("---", "O");
        morse.put("P", "*--*");
        morse.put("*--*", "P");
        morse.put("Q", "--*-");
        morse.put("--*-", "Q");
        morse.put("R", "*-*");
        morse.put("*-*", "R");
        morse.put("S", "***");
        morse.put("***", "S");
        morse.put("T", "-");
        morse.put("-", "T");
        morse.put("U", "**-");
        morse.put("**-", "U");
        morse.put("V", "***-");
        morse.put("***-", "V");
        morse.put("W", "*--");
        morse.put("*--", "W");
        morse.put("X", "-**-");
        morse.put("-**-", "X");
        morse.put("Y", "-*--");
        morse.put("-*--", "Y");
        morse.put("Z", "--**");
        morse.put("--**", "Z");
        morse.put("1", "*----");
        morse.put("*----", "1");
        morse.put("2", "**---");
        morse.put("**---", "2");
        morse.put("3", "***--");
        morse.put("***--", "3");
        morse.put("4", "****-");
        morse.put("****-", "4");
        morse.put("5", "*****");
        morse.put("*****", "5");
        morse.put("6", "-****");
        morse.put("-****", "6");
        morse.put("7", "--***");
        morse.put("--***", "7");
        morse.put("8", "---**");
        morse.put("---**", "8");
        morse.put("9", "----*");
        morse.put("----*", "9");
        morse.put("0", "-----");
        morse.put("-----", "0");
        morse.put(".", "*-*-*-");
        morse.put("*-*-*-", ".");
        morse.put(",", "--**--");
        morse.put("--**--", ",");
        morse.put("?", "**--**");
        morse.put("**--**", "?");


        return morse.get(s);
    }

    public void codeSplitter(String s) {
        //Splits morse code and saves to protected ArrayList for future use.
        //This arraylist is cleared with the hashListGetter method.


        String[] tempMorseArray = s.split(" ");

        for (int i = 0; i < tempMorseArray.length; i++) {

            notTranslated.add(i, tempMorseArray[i]);

        }


    }

    public void hashListGetter() {
        //Runs input through hashmap to get return values and then clears contents on untranslated arraylist.
        //Also refuses saving of input if it does not exist within the hashmap. No null returns are allowed.
        String temp;
        for (int i = 0; i < notTranslated.size(); i++) {

           try {
               temp = convertMap(notTranslated.get(i));
               if (!temp.contains("null") || !temp.contains(null)) {
                   isTranslated.add(temp);
               }

           }catch (Exception e){
               System.out.println("Errorous input, please check your spelling! Remember, only capital letters are allowed!");
           }

        }
        notTranslated.clear();
    }

    public String arrayLetterListPrinter() {
        //returns contents or translated arrays as a String.

        String savedWords = "";

        for (int i = 0; i < isTranslated.size(); i++) {
            if (i == 0) {
                savedWords = savedWords + isTranslated.get(i);
            } else {
                savedWords = savedWords + " " + isTranslated.get(i);
            }
        }
        return savedWords;

    }

    public String arrayMorseListPrinter() {
        //Returns array list of morse code or alphabet not yet translated.
        // Used during Testing/TDD to control information flow.
        String printString = "";
        for (int i = 0; i < notTranslated.size(); i++) {
            printString = printString + notTranslated.get(i);
        }
        return printString;
    }

    public void dataRemover() {
        //Clears all array-lists and resets the array list positions allowing the user to start again.
        isTranslated.clear();
        notTranslated.clear();
    }

    public void cheatSheetPrinter() {
        System.out.println("The cheat sheet of morse! BEHOLD!");
        System.out.println("A = *-");
        System.out.println("B = -***");
        System.out.println("C = -*-*");
        System.out.println("D = -**");
        System.out.println("E = *");
        System.out.println("F = **-*");
        System.out.println("G = --*");
        System.out.println("H = ****");
        System.out.println("I = **");
        System.out.println("J = *---");
        System.out.println("K = -*-");
        System.out.println("L = *-**");
        System.out.println("M = --");
        System.out.println("N = -*");
        System.out.println("O = ---");
        System.out.println("P = *--*");
        System.out.println("Q = --*-");
        System.out.println("R = *-*");
        System.out.println("S = ***");
        System.out.println("T = -");
        System.out.println("U = **-");
        System.out.println("V = ***-");
        System.out.println("W = *--");
        System.out.println("X = -**-");
        System.out.println("Y = -*--");
        System.out.println("Z = --**");
        System.out.println("1 = *----");
        System.out.println("2 = **---");
        System.out.println("3 = ***--");
        System.out.println("4 = ****-");
        System.out.println("5 = *****");
        System.out.println("6 = -****");
        System.out.println("7 = --***");
        System.out.println("8 = ---**");
        System.out.println("9 = ----*");
        System.out.println("0 = -----");
        System.out.println(". = *-*-*-");
        System.out.println(", = --**--");
        System.out.println("? = **--**");


    }

    public void jokeRandomizer() {
        int upper = 5;
        int int_random = rand.nextInt(upper);

        HashMap<Integer, String> morseJokes = new HashMap<>();
        morseJokes.put(0, "What do you call an apology in morse code?, Remorse code.");
        morseJokes.put(1, "Teacher: Do you know how to write an s in morse code? Me: ...");
        morseJokes.put(2, "- **** * / -- * *- -* ** -* --* / --- **-* / *-** ** **-* * / ** *** / ****- **---");
        morseJokes.put(3, "Tap dancing, as an art form, never really spoke to me... ...until I learned Morse code.");
        morseJokes.put(4, "So I saw a truck called 'The Morse Deliverers' reversing yesterday, For some reason it just kept on saying 'S'");
        morseJokes.put(5, "Telegraph Operators once complained to Morse how some of his codes were confusing and needs to be revised. But he had no remorse.");

        System.out.println(morseJokes.get(int_random));

    }

    public String indexGetter(int i) {
        return isTranslated.get(i);

    }
}
