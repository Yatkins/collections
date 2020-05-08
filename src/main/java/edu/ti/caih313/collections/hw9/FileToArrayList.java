package edu.ti.caih313.collections.hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileToArrayList {

    public static void main(String[] args){
        File file = new File("src/main/resources/inputSentences");
        System.out.println("I will read from the file " + file);
        System.out.println(fileToArray(file));
    }

    private static String fileToArray(File file){
        Scanner input = null;
        ArrayList<ArrayList<String>> wholeFile = new ArrayList<>();
        String index = "";
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                ArrayList<String> sentence = new ArrayList<>();
                while (input.hasNext()) {
                    sentence.add(input.next());
                    wholeFile.add(sentence);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            if(input != null){
                input.close();
            }
            System.out.println("Enter a sentence number and a word number");
            System.out.println("I will give you the word that occurs at that index");
            Scanner keyboard = new Scanner(System.in);
            int sentenceNum = keyboard.nextInt();
            int wordNum = keyboard.nextInt();
            ArrayList<String> askedSentence = (ArrayList<String>) wholeFile.get(sentenceNum);
            index = askedSentence.get(wordNum);
        }return index;
    }
}
    //Write a program that will read sentences from a text file,
// placing each sentence in its own instance of ArrayList.
// (You will create a sentence object by adding words to it one at a time as they are read.)
// When a sentence has been completely read, add the sentence to another instance of ArrayList.
// Once you have read the entire file, you will have an instance of ArrayList that contains several instances of ArrayList,

// If the sentence number or word number is not valid, provide an appropriate error message.