package edu.ti.caih313.collections.hw9;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class CreatingHashMap {

    public static void main(String[] args) {
        System.out.println("Enter a list of positive values, followed by a negative");
        Scanner keyboard = new Scanner(System.in);
        HashMap<Integer, Integer> hash = new HashMap<>();
            Integer x = keyboard.nextInt();
            while (x > -1) {
                if (hash.containsKey(x)) {
                    int value = hash.get(x);
                    value++;
                    hash.put(x, value);
                } else {
                    hash.put(x, 1);
                }
                x = keyboard.nextInt();
        }
            Iterator iterator = hash.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry entry = (Map.Entry) iterator.next();
                System.out.println("The number " + entry.getKey() + " occurs " + entry.getValue() + " times.");
                iterator.remove();
            }
    }
}
