/**
 *
 * Java1. Home Work 3
 * @author Aleksandr Konditerov
 * @version date 02.12.2017
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java1Lesson3 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        guessNumber();
        guessTheWord();
    }

    public static void guessNumber() {
        int repeat;
        int rounds = 0;
        int victory = 0;
        int losses = 0;

        do {

            int guessNumber = random.nextInt(10);
            int assumption;

            System.out.println(rounds != 0 ? "You know the rules....." : "Greetings and welcome... I want to play a game.");
            System.out.println("guess number....");

            for (int i = 0; i <= 3; i++) {
                if (i == 3) {
                    System.out.println("you lose");
                    losses++;
                    break;
                } else {
                    assumption = scanner.nextInt();
                    if (assumption == guessNumber) {
                        System.out.println("Victory");
                        victory++;
                        break;
                    } else if (i != 2) {
                        System.out.println(guessNumber > assumption ? "Guess number is greater" : "Guess number is less");
                    }
                }
            }
            do {
                System.out.println("are you ready to play more? 1 yes / 0 no");
                repeat = scanner.nextInt();
            } while (repeat < 0 && repeat > 1);
            rounds++;
            if (repeat == 0) {
                System.out.println(rounds != 1 ? "Played rounds: " + rounds + ", viktory: " + victory + ", losses: " + losses : "Played rounds: " + rounds);
            }
        }
        while (repeat == 1);
    }

    public static void guessTheWord() {
        String assumption;
        int lengthOfword;
        char[] assumptionArr = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        String words = null;

        try {
            int b;
            FileReader file = new FileReader("text.txt");
            while ((b = file.read()) != -1)
                words +=((char)b);
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(words);
        String[] wordsArr = words.split(",");
        int randomWord = random.nextInt(wordsArr.length);
        String word = wordsArr[randomWord];

        System.out.println("I made one of these words " + Arrays.toString(wordsArr));

        while (true) {
            assumption = scanner.nextLine().toLowerCase();
            if (assumption.equals(word)) {
                System.out.println("Victory. I really meant " + wordsArr[randomWord]);
                break;
            } else {
                lengthOfword = word.length() > assumption.length() ? assumption.length() : word.length();
                for (int i = 0; i < lengthOfword; i++) {
                    if (word.charAt(i) == assumption.charAt(i)) {
                        assumptionArr[i] = word.charAt(i);
                    } else
                        continue;
                }
                for (char i : assumptionArr)
                    System.out.print(i);
                System.out.println("Try again");
            }
        }
    }
}
