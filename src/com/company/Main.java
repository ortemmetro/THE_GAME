package com.company;

import com.company.controllers.EnemyController;
import com.company.entities.Enemy;
import com.company.repositories.EnemyRepositories;
import com.company.repositories.interfaces.IEnemyRepositories;

public class Main {

    private static MyApplication app;

    public static void main(String[] args) {
//        IDB db = new PostgresDB();
//        IEnemyRepositories repo = new EnemyRepositories(db);
//        EnemyController controller = new EnemyController(repo);
//        MyApplication app = new MyApplication(controller);
        app.start(); //starting the My Application
    }
}
