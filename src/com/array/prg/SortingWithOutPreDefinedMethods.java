/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array.prg;

import java.util.Arrays;

/**
 *
 * @author HOME
 */
public class SortingWithOutPreDefinedMethods {
    public static void main(String[] args) {
        int arraySort[] = {40,30,10,20,50}; //10,20,30,40,50
        for (int i = 0; i < arraySort.length; i++) {
            int temp = 0;
            for (int j = i+1; j < arraySort.length; j++) {
                
                if(arraySort[i] > arraySort[j]){ //asending order
//                if(arraySort[i] < arraySort[j]){ // disending order
                    temp = arraySort[i];
                    arraySort[i] = arraySort[j];
                    arraySort[j] = temp;
                    System.out.println("array : "+Arrays.toString(arraySort));
                }
            }
        }
    }
}
