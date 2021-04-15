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
public class TestArrayContainsSpecificValue {
    public static void main(String[] args) {
        int arrayElements[] = new int[]{1,30,20,40,60,50,70,80,110};
        
        System.out.println("contains value or not : "+contains(arrayElements,20));
        System.out.println("contains value or not : "+contains(arrayElements,200));
    }

    private static boolean contains(int[] arrayElements, int i) {
        boolean value = false;
        for(int n : arrayElements){
            if(n == i){
                return true;
            }
        }
        return false;
    }
}
