package edu.ti.caih313.collections.lab9;

import java.util.ArrayList;

public class Ledger {

    private ArrayList<Double> arrayList = new ArrayList<Double>();

    public Double get(int i){
        return arrayList.get(i);
    }
    //adds a sale whose value is d
    public void addSales(Double d){
        arrayList.add(d);
    }

     //returns the number of sales made
    public int  getNumberOfSales(){
        int numSales = 0;
        for(int i = 0; i < arrayList.size(); i++){
            numSales++;
        }
        return numSales;
    }

    //returns the total value of the sales
    public Double getTotalSales(){
        Double total = 0.00;
        for(int i = 0; i < arrayList.size(); i++){
            total += arrayList.get(i);
        }return total;
    }

    //returns the average value of all the sales
    public Double getAverageSale(){
        Double total = 0.00;
        int numSales = 0;
        for(int i = 0; i < arrayList.size(); i++){
            total += arrayList.get(i);
            numSales++;
        }return total/numSales;
    }

    //returns the number of sales that exceeded v in value
    public int getCountAbove(Double v){
        int greaterThanV = 0;
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) > v){
                greaterThanV++;
            }
        }return greaterThanV;
    }
}







