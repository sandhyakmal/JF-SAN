package com.bcafinance.fundamental.day4;
/*
@Author Andara a.k.a. Sandhy
Junior Programmer
Created with IntelliJ IDEA Version 2022.2.3 (Community Edition)
Created on 11/10/2022 1:56 PM
Last Modified on 11/10/2022 1:56 PM
Version 1.0
*/

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int [] intArr = {3,8,5,2,1,9,11,10};
        int intB =11;
        boolean isFound = true ;


        for (int i = 0;i<intArr.length;i++){
            if(intB == intArr[i]){
                System.out.println("Angka "+intB+" Ditemukan pada index ke-"+i);
                isFound=false;
            }
        }
        if (isFound==true){
            System.out.println("Angka "+intB+" yang Dicari tidak ditemukan ");
        }
    }


}
