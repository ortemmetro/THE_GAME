package com.company;

import java.util.Scanner;

public class Options {


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
                    System.out.println("");
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
