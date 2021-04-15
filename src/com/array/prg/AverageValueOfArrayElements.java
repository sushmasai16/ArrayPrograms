/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array.prg;

/**
 *
 * @author HOME
 */
public class AverageValueOfArrayElements {
    
    public static void main(String[] args) {
        int[] arrayElements = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i = 0; i < arrayElements.length; i++) {
            sum = sum + arrayElements[i];
        }
        double average = sum/ arrayElements.length;
        System.out.println("Average Value Of Array Elements : "+average);
    }
}
