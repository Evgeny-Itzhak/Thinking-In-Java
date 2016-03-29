package com.company.home.Chapter5;

import java.util.Arrays;

/**
 * Created by Itzhak-Miryam on 10.02.2016.
 */
public class ArrayTask16 {

    String string;

    ArrayTask16(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        ArrayTask16 task16 = new ArrayTask16("This is S");
        System.out.println(task16.string);
        ArrayTask16[] arrayTask16s = new ArrayTask16[5];

        for (int i = 0; i<arrayTask16s.length; i++){
            arrayTask16s[i] = new ArrayTask16("s"+i);
        }

        System.out.println(Arrays.toString(arrayTask16s));
    }
}
