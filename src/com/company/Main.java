package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseLogic morse = new MorseLogic();
        boolean quit = false;
        String x;
        System.out.println("=================================================");
        System.out.println("Hello and welcome to the morse code converter! The functions of the program are chosen by pressing the corresponding key!");
        System.out.println("1.Chose morse or alphabet to be converted!");
        System.out.println("2.Print the converted characters.");
        System.out.println("3.Print a cheat-sheet of available morse-code.");
        System.out.println("4.Print a random somewhat morse related joke.");
        System.out.println("5.Clear all saved information.");
        System.out.println("6.Print a specific translation using the array index.");
        System.out.println("9.Quit the program and return to the 9-5.");
        System.out.println("=================================================");

        while (quit == false) {


            x = scan.nextLine();
            switch (x) {
                case "1":
                    System.out.println("Please type your chosen morse or alphabet to be converted, separated by spaces!");
                    morse.codeSplitter(scan.nextLine());
                    morse.hashListGetter();
                    break;

                case "2":
                    if (morse.isTranslated.size() > 0) {
                        System.out.println("Printing converted characters!");
                        System.out.println(morse.arrayLetterListPrinter());
                        break;
                    }
                    else{
                        System.out.println("There are no saved characters at the moment!");
                        break;
                    }

                case "3":
                    System.out.println("Now printing list of available morse code.");
                    morse.cheatSheetPrinter();
                    break;

                case "4":
                    morse.jokeRandomizer();
                    break;

                case "5":
                    System.out.println("Purging all conversions and starting over.");
                    morse.dataRemover();
                    break;

                case "6":
                    if (morse.isTranslated.size() > 0) {
                        System.out.println("Numbers between 0 and " + (morse.isTranslated.size() - 1) + " is available.");
                    }
                    else{
                        System.out.println("There is nothing saved yet!");
                        break;
                    }
                    //System.out.println("Numbers between 0 and " + (morse.isTranslated.size() - 1) + " is available.");
                    try {
                        System.out.println(morse.indexGetter(Integer.parseInt(scan.nextLine())));
                    } catch (Exception e) {
                        System.out.println("Incorrect input! Please try again!");
                    }
                    break;

                case "9":
                    System.out.println("It was nice meeting you, now proceeding to self destruct.");
                    quit = true;
                    break;

                default:
                    System.out.println("Incorrect input! Please check your spelling!");

            }
        }

    }
}
