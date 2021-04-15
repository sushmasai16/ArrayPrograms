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
public class SortingWithPreDefineMethod {
    public static void main(String[] args) {
        int[] array = {10,40,50,15,6,25};
        String[] stringArray = {"sushma","sweetha","ravi","chinnu","bhommi","sai","tanvi"};
        System.out.println("Original numeric array : "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted numeric array : "+Arrays.toString(array));
        System.out.println("Original string array : "+Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Original string array : "+Arrays.toString(stringArray));
    }
}
