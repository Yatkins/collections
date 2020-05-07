package edu.ti.caih313.collections.lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class CountFamilies {
    public static void main(String[] args){
        ArrayList<Double> income = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter family incomes, then enter a negative number to stop");
        Double max = 0.00;
        Double x = keyboard.nextDouble();
        while(x > -1) {
            income.add(x);
            if(x>max){
                max = x;
            }
            x = keyboard.nextDouble();
        }System.out.println("I will tell you which families have an income less than 10% of the highest income");
            Double tenPercentOfMax = max/10;
        System.out.println(lowIncome(income, tenPercentOfMax));
    }


    static String lowIncome(ArrayList income, Double tenPercentOfMax){
        ArrayList<Double> lowerIncome = new ArrayList<>();
        int numFams = 0;
        for(int i = 0; i < income.size(); i++){
            Double x = (Double) income.get(i);
            if(x.compareTo(tenPercentOfMax) <= 0){
                lowerIncome.add(x);
                numFams++;
            }
        }return numFams + " families have an income less than " + tenPercentOfMax + ", their incomes are: " + lowerIncome;
    }
}


    /*counts the number of families whose income is below a certain value.

    Then count the families that make less than 10 percent of this maximum income.
    Display this count and the incomes of these families.
     */