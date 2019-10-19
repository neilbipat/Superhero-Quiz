package com.ga.superhero;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        SuperHero dog = new SuperHero();
//        System.out.println(dog.yellLoudly());

//        First need to create an object to the SuperHero file, and then give it a variable
         SuperHero dog = new SuperHero();
         System.out.println((dog.heroFunction()));

         dog.outputQuestions(dog.heroFunction());






    }
}
