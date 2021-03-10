package com.company;

import com.company.controllers.EnemyController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.EnemyRepositories;
import com.company.repositories.interfaces.IEnemyRepositories;

public class Main {



    public static void main(String[] args) {

//        IDB db = new PostgresDB();
//        IEnemyRepositories repo = new EnemyRepositories(db);
//        EnemyController controller = new EnemyController(repo);
//        MyApplication app = new MyApplication(controller);
        MyApplication.difficulty();
        MyApplication.start(); //starting the My Application

    }
}