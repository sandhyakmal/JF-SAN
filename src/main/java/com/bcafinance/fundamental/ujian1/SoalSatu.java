package com.bcafinance.fundamental.ujian1;
/*
@Author Andara a.k.a. Sandhy
Junior Programmer
Created with IntelliJ IDEA Version 2022.2.3 (Community Edition)
Created on 11/11/2022 1:40 PM
Last Modified on 11/11/2022 1:40 PM
Version 1.0
*/

import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        int intNumber = 0;
        int intTotal =0;

        boolean isAgaian = true;

        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Masukan Angka Sepuasnya: ");
                intNumber = sc.nextInt();
                isAgaian=true;
            } catch (Exception e){
                intTotal += intNumber;
                System.out.println("Jumlah "+intTotal);
                isAgaian=false;
            }
        } while (isAgaian==true);
    }
}
