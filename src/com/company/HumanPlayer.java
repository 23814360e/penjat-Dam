package com.company;

import java.util.Scanner;

/**
 * Created by 23814360e on 27/01/2017.
 */
public class HumanPlayer {

    private Scanner scanner = new Scanner(System.in);


    public char chooseLetter() {

        String letter = "";
        while (true){

            GamePrinter.printInstructions();
            letter = scanner.next();

            if (letter.length()==1 && Character.isLetter(letter.charAt(0))){
            return Character.toLowerCase(letter.charAt(0));

            }
        }
    }
}
