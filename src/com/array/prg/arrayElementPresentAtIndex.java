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
public class arrayElementPresentAtIndex {
    public static void main(String[] args) {
        int arrayElemetns[] = new int [] {10,20,30,40,50};
        
        System.out.println("arrat element at index at using for loop : "+usingForLoop(arrayElemetns,20));
        System.out.println("arrat element at index at using while loop : "+usingWhileLoop(arrayElemetns,40));
    }

    private static int usingForLoop(int[] arrayElemetns, int num) {
        int index = -1;
        for (int i = 0; i < arrayElemetns.length; i++) {
            if(num == arrayElemetns[i]){
                return i;
            }
        }
        return -1;
    }

    private static int usingWhileLoop(int[] arrayElemetns, int num) {
//        System.out.println("dd");
        int index = -1;
        int numpos = 0;
        while(numpos < arrayElemetns.length){
            if(num == arrayElemetns[numpos]){
                return numpos;
            }
        }
        return -1;
    }
}
