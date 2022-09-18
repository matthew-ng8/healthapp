package com.example.roulettewheel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RouletteWheel {
    private ArrayList<String> internalList;
    private final String INPUT_FILE = "input.txt";
    public RouletteWheel(){
        internalList = new ArrayList<>();
        try {
            File inputFile = new File(INPUT_FILE);
            Scanner myReader = new Scanner(inputFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                internalList.add(data);
            }
            myReader.close();
        }catch(Exception e){
            System.out.println("Error occured trying to open and read in a file");
        }

    }

    public boolean addToList(String newItem){
        if(internalList.contains(newItem)){
            /*Only unique strings so don't add if not unique */
            return false;
        }

        /*add to list, save to disk and return true*/
        return false;
    }

    public String getRandomItem(){
        int index = (int)(Math.random()*internalList.size());
        return internalList.get(index);
    }

}
