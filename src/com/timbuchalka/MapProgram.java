package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    
    public static void main(String[] args) {
       Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java is already exists");
        } else {
            languages.put("Java", "a compiled high level object oriented, platform inependant language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted , object - orietntted, high-level programming language with dynamic semantics");
        System.out.println(languages.put("Algol", "an algorythmic language"));
        System.out.println(languages.put("Lisp","Therein lies madness"));


        //so if we use put and overwritting existing key, the method put returns itself the value for the previous key, we can check what was overwritted
        System.out.println(languages.put("Java", "this course is about Java")) ; //for a particular key there only can be a one particular value
        System.out.println(languages.get("Java")); //it gets overwritten

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("========================================================");

        //languages.remove("Lisp");

        if(languages.remove("Algol", "an algorythmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp","Therein lies madness", " a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("List was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
