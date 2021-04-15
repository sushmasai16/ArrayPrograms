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
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arraySumElements = {10,20,30,40};
        int sum = 0;
//        for(int i = 0 ; i < arraySumElements.length ; i++){
//            sum = sum + arraySumElements[i];
//        }
        for (int i : arraySumElements) {
//            sum += i;
            sum = sum + i;
        }
        System.out.println("Sum : "+sum);
    }
}
