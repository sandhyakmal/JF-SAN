package com.bcafinance.fundamental.ujian1;
/*
@Author Andara a.k.a. Sandhy
Junior Programmer
Created with IntelliJ IDEA Version 2022.2.3 (Community Edition)
Created on 11/11/2022 2:16 PM
Last Modified on 11/11/2022 2:16 PM
Version 1.0
*/

import java.util.Locale;
import java.util.Random;

public class SoalDua {
    public static void main(String[] args) {
        String strVokal = "AIUEO".toLowerCase();
        String strKonso = "BCDFGHJKLMNPQRSSTVWXYZ".toLowerCase();
        String strSemua = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        char[] charVokal = strVokal.toCharArray();
        char[] charKonso = strKonso.toCharArray();
        char[] charSemua = strSemua.toCharArray();

        String strTampung = "";

        Random rand = new Random();
        int tampung = rand.nextInt(2);
        for (int i = 0;i< rand.nextInt(10,100);i++){
            if (i<7){
               if (tampung==1){
                   tampung=2;
                   strTampung += charVokal[rand.nextInt(5)];

//                   System.out.print(strTampung);
               } else {
                   tampung=1;
                   strTampung += charKonso[rand.nextInt(22)];
//                   System.out.print(charKonso[rand.nextInt(22)]);
               }
            } else {
                strTampung += charSemua[rand.nextInt(26)];
            }
        }
        String strHasil = strTampung.substring(0,1);
        String strCoba = strTampung.substring(1,strTampung.length());
        String strB = strHasil.toUpperCase()+strCoba;
        System.out.print(strB);

    }
}
