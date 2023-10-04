package ru.flykby.aikamshop.services;

import com.google.gson.Gson;

import ru.flykby.aikamshop.entity.input.Criterias;

public class JsonReader {
    
    public static void getData(String path) {
        Gson gson = new Gson();
        Criterias criterias = gson.fromJson(path, Criterias.class);
        System.out.println(criterias);
    }

}