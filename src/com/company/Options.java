package com.company;

import com.company.entities.Hero;

import java.util.Scanner;

public class Options {
    static Hero hero = new Hero();
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
                    System.out.println("1. Easy (For beginners)");
                    System.out.println("2. Normal (For amateur gamers)");
                    System.out.println("3. Hard (For Nursultan Khaimuldin)");
                    int diff = scanner.nextInt();
                    if(diff == 1){
                        hero.setLife(3);
                    }
                    else if(diff == 2){
                        hero.setLife(2);
                    }
                    else if(diff == 3){
                        hero.setLife(1);
                    }
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
