package com.company;

import com.company.entities.Hero;

import java.util.Scanner;

public class Options {
    Hero hero = new Hero();

    public static int getDiff() {
        return diff;
    }

    public static void setDiff(int diff) {
        Options.diff = diff;
    }

    private static int diff;

    public static void showOptions() {

        Scanner scanner = new Scanner(System.in);
        int command;
        do {
            System.out.println("Select option");
            System.out.println("1.Change difficulty");
            System.out.println("2.Cheat codes");
            System.out.println("3.Exit");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Choose difficulty: ");
                    System.out.println("1. Hard (For Nursultan Khaimuldin)");
                    System.out.println("2. Normal (For amateur gamers)");
                    System.out.println("3. Easy (For beginners)");
                    int lives = scanner.nextInt();
                    setDiff(lives);

                    System.out.println("You have "+ lives+" lives!");
                    break;
                case 2:
                    System.out.println("https://www.youtube.com/watch?v=-15VC4Yxzys");
                    break;
                case 3:
                    MyApplication.start();
                    break;

            }

        } while (command != 3);



    }


}