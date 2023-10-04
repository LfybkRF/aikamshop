package ru.flykby.aikamshop;

import ru.flykby.aikamshop.services.JsonReader;



public class App {
    public static void main(String[] args) {
        // String operationType = args[0];
        // String inputName = args[1];
        // String outputName = args[2];


        JsonReader.getData("./input/input.json");
        
    }
}
