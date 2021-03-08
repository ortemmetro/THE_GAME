package com.company;

import com.company.controllers.EnemyController;
import com.company.entities.Hero;
//import com.company.controllers.MedicineController;
//import com.company.entities.Medicine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    static Hero hero = new Hero();
    public MyApplication() {

    }

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        int command;

        System.out.println("-------------------------------------------------------");
        System.out.println("              Welcome to The Game");
        System.out.println("_______________________________________________________");
        System.out.println("1: Start new game");
        System.out.println("2: Options");
        System.out.println("3: Credits");
        System.out.println("4: Exit");

        command = scanner.nextInt();

        switch (command) {
            default:
                System.out.println("Hmm... Something is wrong... Error, please try again!");

            case 1:
                startNewGame();
                break;
            case 2:
                Options.showOptions();

            case 3:
                presentCredits();

            case 4:
                break;
        }
    }


    private static void presentCredits() {
        System.out.println("Created by ARTEM RUPPEL and OLZHAS OTEP");
        start();
    }

    private static void startNewGame() {
        System.out.println("The Game is starting!");
        runNewGame();

    }

    private static void waitTime() {
        try {
            Thread.sleep(2000); // Wait 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void runNewGame() {


        boolean runGame = true;

        THEGAME:
        while (runGame) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------------------------");
            waitTime();
            System.out.println("-----------------------------------");
            waitTime();
            System.out.println("-----------------------------------");
            waitTime();
            System.out.println("-----------------------------------");

            waitTime();

            System.out.println("Life is so amazing!");
            waitTime();
            System.out.println("But...");
            waitTime();
            System.out.println("You are dead...");
            waitTime();
            System.out.println("But don't worry! :D");
            waitTime();
            System.out.println("The Game is just starting");
            waitTime();
            System.out.println();
            System.out.println();
            System.out.println();
            waitTime();
            System.out.println("Do you know who are you..?");
            waitTime();
            System.out.println("-------------------------------------------");
            System.out.println("1. I am simple office worker from AITU...");
            System.out.println("2. I am an analyst...");
            System.out.println("3. I am...");
            int prevLifeChoose = scanner.nextInt();
            String prevLife = "";
            if (prevLifeChoose == 1) {
                prevLife = "office plankton";

            } else if (prevLifeChoose == 2) {
                prevLife = "analyst";

            }

            if (prevLifeChoose != 3) {
                System.out.println("You are simple " + prevLife);
                System.out.println("...");
                waitTime();
                System.out.println("I thought your life was more exciting.");
                System.out.println("");
            } else {
                System.out.println("Don't you wanna tell?");
                waitTime();
                System.out.println("Nevermind...");

            }


            waitTime();
            System.out.println("Oh, your first opponent, I hope you will die during the battle");
            hero.setArmor_points(200);
            hero.setHealth_points(100);
            hero.setDamage(50);
            hero.toString();

            break;
        }
    }

}

