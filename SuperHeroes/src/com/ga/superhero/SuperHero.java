package com.ga.superhero;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class SuperHero {


    public static ArrayList<String> heroFunction() {
        ArrayList<String> roleCall = new ArrayList<String>();

        String file = "/Users/neilbipat/Desktop/Real-H.W./Week-4/Day-2-Tuesday/homework12-week4-exceptions/SuperHeroes/input.txt";

        try{
            //  To open the file object
          FileReader inputFile = new FileReader(file);
         //   To obtain the content inside the file
          BufferedReader bufferedReader = new BufferedReader(inputFile);
//            to get a line at time
          String line;

          while ((line = bufferedReader.readLine())!= null) {
              System.out.println();
              roleCall.add(line);
            }
          bufferedReader.close();


        }catch (Exception e){
            System.out.println("There is an error");
        }
      return roleCall;
    }

//    public static ArrayList<heroFunction>
//    public static String questions() {
//
//        String question = "Who was kicked out of the Justice League?";
//        if(question =  )
//    }
        public static void outputQuestions(ArrayList<String> hero){

            Scanner user = new Scanner(System.in);
            String Question = "Who was kicked out of the Justice League?";
            System.out.println(Question);
            String choice = "";
            String player = "";
            String[] right = new String[3];
            String[] wrong = new String[3];
            String userName = "";
            System.out.println("Enter userName");
            player = user.nextLine();
            System.out.println("Enter answer");
            choice = user.nextLine();

            if(player != ""){
                System.out.println("(Joker Voice) Let the Games Begin!");

                if(choice.equals(hero.get(1))){
                    System.out.println("Correct, you saved the day");
//                right.add(choice);

                    try{
                        FileWriter fw=new FileWriter("/Users/neilbipat/Desktop/Real-H.W./Week-4/Day-2-Tuesday/homework12-week4-exceptions/SuperHeroes/output.txt");
                        fw.write("You did it!!!");
                        fw.close();
                    }catch(Exception e){System.out.println(e);}
                    System.out.println("Success...");

                }else{
                    System.out.println("Oh no you're wrong, the villains won!");
                }
//            } else if (player == ""){
//                System.out.println("Please Enter User Name");
            }


    }

        }





