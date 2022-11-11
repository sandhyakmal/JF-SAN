package com.bcafinance.fundamental.day5;
/*
@Author Andara a.k.a. Sandhy
Junior Programmer
Created with IntelliJ IDEA Version 2022.2.3 (Community Edition)
Created on 11/11/2022 8:36 AM
Last Modified on 11/11/2022 8:36 AM
Version 1.0
*/

import java.util.Random;

public class Coba {
    public static void main(String[] args) {
        Random ran = new Random();
        String strA = "BCDFGHJKLMNPQRSTVWXYZ";
        String strB = "AIUEO";
        char[] charA= strA.toCharArray();
        char[] charB= strB.toCharArray();
        int penampung = 0;
        penampung = ran.nextInt(2);

        for (int i = 0;i< 5;i++ ){
            if (i==0){
                if (penampung==0){
                    System.out.print(charA[ran.nextInt(21)]);
                }else {
                    System.out.print(charB[ran.nextInt(5)]);
                }
            } else if (i%2==0){
                if (penampung==0){
                    System.out.print(charA[ran.nextInt(21)]);
                }else {
                    System.out.print(charB[ran.nextInt(5)]);
                }
            } else if (i%2==1){
                if (penampung==0){
                    System.out.print(charB[ran.nextInt(5)]);
                }else {
                    System.out.print(charA[ran.nextInt(21)]);
                }
            }
        }
        for (int i = 0;i< 10;i++ ){
            penampung = ran.nextInt(2);
            if (penampung==1){
                System.out.print(charA[ran.nextInt(21)]);
            }else {
                System.out.print(charB[ran.nextInt(5)]);
            }
        }

    }

}
