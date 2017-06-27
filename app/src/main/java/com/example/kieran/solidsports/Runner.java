package com.example.kieran.solidsports;

/**
 * Created by Kieran on 27/06/2017.
 */

public class Runner {
    public static void main(String[] args) {

        PrintToFile file = new PrintToFile();
        PrintToConsole console = new PrintToConsole();
        Boxer boxer = new Boxer(console, 34, 22);
        Boxer boxer2 = new Boxer(file, 20, 9);
        Gymnast gymnast = new Gymnast(file, 2,4);


        boxer.enterEvent();
        gymnast.enterEvent();

        boxer.runningSession(3);
        boxer.runningSession(2);
        boxer2.runningSession(6);
        boxer2.runningSession(4);



    }
}
