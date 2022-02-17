package com.company;

public class Main {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        MorseLogic morse = new MorseLogic();
        System.out.println("Welcome to the Morse-Alphabet converter!");
        System.out.println("Please enter the combination of morse code you would like to convert, each entry separated by a space.");
        System.out.println("Inversely, if you would like to convert Alphabetical letters to Morse code, just enter the letters or word you would like to convert!");
        morse.codeSplitter("-*** -*-");
        System.out.println(morse.arrayMorseListPrinter());
        morse.hashListGetter();
        System.out.println(morse.arrayLetterListPrinter());

    }
}
