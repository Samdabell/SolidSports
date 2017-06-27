package com.example.kieran.solidsports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by Kieran on 27/06/2017.
 */

public class PrintToFile implements Printing {

    public void printRunInfo(int distance, int total){
        try (PrintWriter out = new PrintWriter(new FileOutputStream(new File("distancerun.txt"),true))) {
            out.println(String.format("Athlete ran %d km", distance));
            out.println(String.format("Total distance run: %d km", total));
            out.close();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
