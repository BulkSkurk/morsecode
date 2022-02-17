package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class MorseLogic {

    protected ArrayList<String> savedMorse = new ArrayList<String>();
    protected  ArrayList<String> savedLetters = new ArrayList<String>();
    protected int arrayListPosition = 0;


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
        //Also returns internal arrayList position to avoid overwriting.
        int tempPosition = arrayListPosition;
        String[] tempMorseArray = s.split(" ");

        for (int i = 0; i < tempMorseArray.length; i++) {
            savedMorse.add(tempPosition, tempMorseArray[i]);
            arrayListPosition++;

        }
    }
    public void hashListGetter(){
        //Runs input through hashmap to get return values.
        String temp;

        for(int i = 0; i< savedMorse.size(); i++){
            temp = convertMap(savedMorse.get(i));
            savedLetters.add(temp);
        }
    }
    public String arrayLetterListPrinter(){
        //Prints array list of Letters.
        String printString = "";
        for(int i = 0; i < savedLetters.size(); i++){
            printString = savedLetters.get(i) + printString;
        }
        return printString;
    }

    public String arrayMorseListPrinter(){
        //Prints array list of morse code.
        String printString = "";
        for(int i = 0; i < savedMorse.size(); i++){
            printString = printString + savedMorse.get(i);
        }
        return printString;
    }

}
