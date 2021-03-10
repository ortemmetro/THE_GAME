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
        Hero hero = new Hero();
        Enemy enemy = new Enemy("Ogre", 30, 7, 7, 1.5, "coins");
        hero.setLife(Options.getDiff());
        int critical_damage;
        int sec1=0;
        int sec2=0;
        boolean runGame = true;


        while (runGame) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------------------------");
            waitTime(sec1);
            System.out.println("-----------------------------------");
            waitTime(sec1);
            System.out.println("-----------------------------------");
            waitTime(sec1);
            System.out.println("-----------------------------------");

            waitTime(sec2);

            System.out.println("Life is so amazing!");
            waitTime(sec2);
            System.out.println("But...");
            waitTime(sec2);
            System.out.println("You are dead...");
            waitTime(sec2);
            System.out.println("But don't worry! :D");
            waitTime(sec2);
            System.out.println("The Game is just starting");
            waitTime(sec2);
            System.out.println();
            System.out.println();
            System.out.println();
            waitTime(sec2);
            System.out.println("Do you know who are you..?");
            waitTime(sec1);
            System.out.println("-------------------------------------------");
            System.out.println("1. I am simple office worker");
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
                waitTime(sec2);
                System.out.println("...");
                waitTime(sec2);
                System.out.println("I thought your life was more exciting.");
                System.out.println("");
            } else {
                System.out.println("Don't you wanna tell?");
                waitTime(sec2);
                System.out.println("Nevermind...");

            }
            waitTime(sec2);
            System.out.println("\n" +
                    "Anyway, do you know your name?");
            waitTime(sec1);
            System.out.println("Enter your name: ");
            hero.setName(scanner.next());
            System.out.println("Clear...");
            System.out.println("What is your gender?");
            System.out.println("1. I am a man");
            System.out.println("2. I am a girl");
            System.out.println("3. I am attack helicopter");
            int genderCh = scanner.nextInt();

            if(genderCh==1){
                hero.setGender("male");
                System.out.println("You're more of a spoiled boy than a man.");
            }
            else if(genderCh==2){
                hero.setGender("female");
                System.out.println("Oh, my apologies mademoiselle");
            }
            else if(genderCh==3){
                hero.setGender("underfined");
                System.out.println("What a coincidence. I'm like that, too. We are very much alike)");
            }

            waitTime(sec2);
            System.out.println("\n\n\nOh, your first opponent, good luck");
            System.out.println(hero);

            System.out.println("Your opponent.");
            System.out.println(enemy);

            while(enemy.getHealth_points()>0) {
                System.out.println("What would you like to do?");
                System.out.println("*********************************");
                System.out.println("1. Attack");
                System.out.println("2. Drink health potion");
                System.out.println("3. Run");

                String input = scanner.next();
                if (input.equals("1")) {
                    double damageToEnemy = hero.getDamage() - hero.getDamage() * 0.01 * enemy.getArmor_points();
                    double damageToHero = enemy.getDamage() - enemy.getDamage() * 0.01 * hero.getArmor_points();
                    enemy.setHealth_points(enemy.getHealth_points() - damageToEnemy);
                    System.out.println("------------------------------");
                    System.out.println("You strike the " + enemy.getType() + " with " + damageToEnemy);
                    System.out.println("Damage taken: " + damageToHero);
                    System.out.println(enemy);
                    if(hero.getHealth_points()<5){
                        System.out.println("\t>You have low HP. You are weak to go on");
                    }

                }
                else if(input.equals("2")){
                    hero.setHealth_points(hero.getHealth_points()+20);
                }
                else {
                    break;
                }
            }

            waitTime(sec2);
            System.out.println("\n\n\nYou are so weak. But nevermind... Welcome to The Game "+hero.getName() + ".");

            break;
        }
    }


}