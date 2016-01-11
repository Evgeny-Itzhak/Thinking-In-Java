package com.company.home;

import java.util.Arrays;

public class FibonacciTask {

    // 0 1 1 2 3 5 8 13 21

    public static Integer countFibonacci(int number){

        if (number<1) return 0;

        int[] arrayFibonacci = new int[number];

        for(int i=0; i<arrayFibonacci.length; i++){
            if (i<0) { arrayFibonacci[i] = 0; return 0; }
            if (i==1) {arrayFibonacci[i] = 1;}
            if(i>1) {arrayFibonacci[i] = arrayFibonacci[i-2]+arrayFibonacci[i-1];}
        }

        System.out.println(Arrays.toString(arrayFibonacci));

        return arrayFibonacci[number-1];
    }


    public static void main(String[] args) {
        System.out.println(countFibonacci(-5));
    }
}
