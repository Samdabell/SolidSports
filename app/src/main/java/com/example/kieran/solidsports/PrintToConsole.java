package com.example.kieran.solidsports;

/**
 * Created by Kieran on 27/06/2017.
 */

public class PrintToConsole implements Printing{

    public void printRunInfo(int distance, int total){
        System.out.println(String.format("Athlete ran %d km", distance));
        System.out.println(String.format("Total distance run: %d km", total));
    }
}
