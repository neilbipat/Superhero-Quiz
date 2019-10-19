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
              roleCall.add(line);
              System.out.println();

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
        public static void outputQuestions1(ArrayList<String> hero){

//            Scanner user = new Scanner(System.in);
//
//            String player = "";
//            String userName = "";
//            System.out.println("Enter userName");
//            player = user.nextLine();
//
//            String Question = "Who was kicked out of the Justice League?";
//            String choice = "";
//
//            System.out.println(Question);
//            System.out.println("Enter answer");
//            choice = user.nextLine();

//            if(player != ""){
//                System.out.println("(Joker Voice) Let the Games Begin!");
//
//                if(choice.equals(hero.get(1))){
//
//                    System.out.println("Correct, you saved the day");
//
//                    try{
//                        FileWriter fw=new FileWriter("/Users/neilbipat/Desktop/Real-H.W./Week-4/Day-2-Tuesday/homework12-week4-exceptions/SuperHeroes/output.txt");
//                        fw.write("You got it right, keep going "+ player+"!!!" );
//                        fw.close();
//                    }catch(Exception e){System.out.println(e);}
//                    System.out.println("Check the output");
//
//                }else{
//                    System.out.println("Oh no you're wrong, the villains won!");
//                    try{
//                        FileWriter fw=new FileWriter("/Users/neilbipat/Desktop/Real-H.W./Week-4/Day-2-Tuesday/homework12-week4-exceptions/SuperHeroes/output.txt");
//                        fw.write("Uh oh you got one , there is still hope "+ player+"." );
//                        fw.close();
//                    }catch(Exception e){System.out.println(e);}
//                    System.out.println("Check the output");
//            }
//
//                }else{
//                System.out.println("Please enter a username");
//            }

    }

    public static void outputQuestions(ArrayList<String> hero){
        boolean flag = true;
        String Question2 = "Who was kicked out of the Justice League?";
        String Question3 = "With Great Power, comes Great Responsibility; who does this refer to?";
        String Question1 = "Who did Doomsday beat in a fight?";
        String Question4 = "Who lost in epic rap battles of history?";
        String[] Questions = {Question1, Question2, Question3, Question4};
        String choice = "";
        Scanner user = new Scanner(System.in);
        String player = "";
        System.out.println("Enter userName");
        player = user.nextLine();


        for(int i = 0; i < hero.size(); i++){
            System.out.println(Questions[i]);

            System.out.println("Enter answer");
            choice = user.nextLine();

           flag =  hero.get(i).equals(choice);
           if(flag == true){
               System.out.println("Correct! keep going!");


           }else{
               System.out.println("Oh no, keep trying! ");
           }
            try{
                    FileWriter fw=new FileWriter("/Users/neilbipat/Desktop/Real-H.W./Week-4/Day-2-Tuesday/homework12-week4-exceptions/SuperHeroes/output.txt");
                    fw.write("Win or lose the game is over and life continues! Reflect and grow stronger!"+ player+"!!!" );
                    fw.close();

                }catch(Exception e) {System.out.println(e);}
                System.out.println("Check the output");
//
        }

    }

}





//
//        if(player != ""){
//            System.out.println("(Joker Voice) Let the Games Begin!");
//
//            if(choice.equals(hero.get(1))){
//
//                System.out.println("Correct, you saved the day");
//
//                try{
//                    FileWriter fw=new FileWriter("/Users/neilbipat/Desktop/Real-H.W./Week-4/Day-2-Tuesday/homework12-week4-exceptions/SuperHeroes/output.txt");
//                    fw.write("You got 1 out of 3 right, keep going "+ player+"!!!" );
//                    fw.close();
//
//                }catch(Exception e){System.out.println(e);}
//                System.out.println("Check the output");
//
//            }else{
//                System.out.println("Oh no you're wrong, but never give up!");
//                try{
//                    FileWriter fw=new FileWriter("/Users/neilbipat/Desktop/Real-H.W./Week-4/Day-2-Tuesday/homework12-week4-exceptions/SuperHeroes/output.txt");
//                    fw.write("Uh oh you got 1 wrong out of 3, there is still hope "+ player+"." );
//                    fw.close();
//                }catch(Exception e){System.out.println(e);}
//                System.out.println("Check the output");
//            }
//
//        }else{
//            System.out.println("Please enter a username");
//        }
//
//    }
//
//        }
//
//
//
//
