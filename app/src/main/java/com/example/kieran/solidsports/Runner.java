package com.example.kieran.solidsports;

/**
 * Created by Kieran on 27/06/2017.
 */

public class Runner {
    public static void main(String[] args) {

        Boxer boxer = new Boxer(34, 22);
        Gymnast gymnast = new Gymnast(2,4);
        PrintToFile file = new PrintToFile();
        PrintToConsole console = new PrintToConsole();

        boxer.enterEvent();
        gymnast.enterEvent();

        boxer.runningSession(3);
        file.printRunInfo(3, boxer);
        console.printRunInfo(3, boxer);



    }
}
