package com.company.home.Chapter5;

/**
 * Created by Itzhak on 10.02.2016.
 */
public class InitializationSectionTask{

    Tank tank1;
    Tank tank2;

    InitializationSectionTask(){
        System.out.println("InitializationSectionTask()");
    }

    {
        tank1 = new Tank();
        tank2 = new Tank();
    }

    public static void main(String[] args) {
        System.out.println("MAIN StaRTED");
        new InitializationSectionTask();
        System.out.println("---- MAIN -----");
        new InitializationSectionTask();
        System.out.println("MAIN ENDED");
    }



}
