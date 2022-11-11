package com.bcafinance.fundamental.day4;
/*
@Author Andara a.k.a. Sandhy
Junior Programmer
Created with IntelliJ IDEA Version 2022.2.3 (Community Edition)
Created on 11/10/2022 2:36 PM
Last Modified on 11/10/2022 2:36 PM
Version 1.0
*/

public class Soal2 {
    public static void main(String[] args) {
        int[] intVal = {66,77,80,84,88,99,100};
        int intA = 77;
        int high = intVal.length-1;
        int med = 0;
        int low=0;
        boolean status = false;

        while (low <= high){
            med = (low+high)/2;
            if(intA==intVal[med]) {
                System.out.println(intA + " Founded in posistion " + (med + 1) + " and index " + med);
                status = true;
                break;
            } else{
                if(intA>intVal[med]) {
                 low = med+1;
                } else {
                 high = med-1;
                }
             }
        }
        if (status==false){
            System.out.println(intA+" Not Found!!");
        }
    }
}
