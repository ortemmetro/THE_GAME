package com.company;

import com.company.controllers.EnemyController;
import com.company.entities.Hero;
//import com.company.controllers.MedicineController;
//import com.company.entities.Medicine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {


    public MyApplication(EnemyController controller) {
    }

    public static void start(){

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
                break;
            case 3:
                presentCredits();

            case 4:
                break;
        }
    }


    private static void presentCredits() {
        System.out.println("Created by ARTEM RUPPEL and OLZHAS OTEP");
    }

    private static void startNewGame() {
        System.out.println("The game is starting!");
    }
}
