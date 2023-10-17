package com.pluralisght;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

//        try{
//            FileWriter writer = new FileWriter("Skills.txt");
//
//            writer.write(("Skills:\n"));
//            writer.write("Java, HTML, CSS, React\n");
//            writer.write("JS, Vue, Next");
//
//            writer.close();
//
//        }catch (Exception ex){
//            System.out.println("An error has occurred!");
//            ex.printStackTrace();
//        }

        try{
        FileWriter fileWriter = new FileWriter("text.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String text;

            for(int i = 1; i > 10; i++){
                text = String.format("Counting: %d\n", i);
                bufferedWriter.write(text);
            }

            bufferedWriter.close();

        }catch (Exception ce) {
            System.out.println("An error has occurred!");
            ce.printStackTrace();
        }
    }
}
