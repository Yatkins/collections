package edu.ti.caih313.collections.hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileToArrayList {

    public static void main(String[] args) {
        File file = new File("src/main/resources/inputSentences");
        System.out.println("I will read from the file " + file);
        System.out.println(fileToArray(file));
    }

    private static String fileToArray(File file) {
        Scanner input = null;
        ArrayList<ArrayList<String>> wholeFile = new ArrayList<>();
        try {
            input = new Scanner(file);
            String fileAsString = "";
            while (input.hasNextLine()) {
                fileAsString += input.nextLine();
            }
                String[] fileSentences = fileAsString.split("[.!?]");
                for(int i = 0; i < fileSentences.length; i++) {
                    String sentence = fileSentences[i];
                    String[] words = sentence.split(" ");
                    ArrayList<String> wordArray = new ArrayList<>();
                    for (int j = 0; j < words.length; j++) {
                        wordArray.add(words[j]);
                    }
                    wholeFile.add(wordArray);
                }System.out.println(wholeFile);
            }
         catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return stringAtIndex(wholeFile);
    }

    public static String stringAtIndex(ArrayList<ArrayList<String>> wholeFile) {
        System.out.println("Enter a sentence number and a word number");
        System.out.println("I will give you the word that occurs at that index");
        Scanner keyboard = new Scanner(System.in);
        int sentenceNum = keyboard.nextInt();
        int wordNum = keyboard.nextInt();
        boolean valid = isValid(sentenceNum-1, wordNum -1, wholeFile);
        if (valid) {
            ArrayList<String> askedSentence = (ArrayList<String>) wholeFile.get(sentenceNum - 1);
            String index = askedSentence.get(wordNum - 1);
            return index;
        } else {
            return "You entered an index that doesn't exist.";
        }
    }

    public static boolean isValid(int sentenceNum, int wordNum, ArrayList<ArrayList<String>> wholeFile) {
        boolean isValid = true;
        if ((sentenceNum > wholeFile.size()) || (wordNum > wholeFile.get(sentenceNum).size())
                || sentenceNum < 0 || wordNum < 0) {
            isValid = false;
        }return isValid;
    }
}


