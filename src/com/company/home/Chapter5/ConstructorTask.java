package com.company.home.Chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Itzhak on 10.02.2016.
 */
public class ConstructorTask {
    private String name;
    private int details;

    ConstructorTask(int detailsCount){
        details = detailsCount;
        System.out.println("Arguments 'int'");
    }
    ConstructorTask(String s, int details){
        this(details);
        name=s;
        System.out.println("String and int");
    }

    ConstructorTask(){
        this("aaa",47);
        System.out.println("without parameters");
    }

    int i=0;
    protected void finalize(){
        System.out.println("*** это метод finalize()"  + i);
        i++;
    }
        //Super.finalize();

    public static void main(String[] args) {

        ConstructorTask constructorTask = new ConstructorTask();

        List<ConstructorTask> list = new ArrayList<ConstructorTask>();


        for(int i=0; i<100001; i++){
           list.add(new ConstructorTask());
        }

        //constructorTask.finalize();
        //new ConstructorTask();
        //System.gc();

        list.get(100000);
        System.gc();

    }

}
