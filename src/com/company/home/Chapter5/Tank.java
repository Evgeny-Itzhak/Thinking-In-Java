package com.company.home.Chapter5;

/**
 * Created by Itzhak-Miryam on 10.02.2016.
 */
public class Tank {
    boolean full = false;

    Tank(){
        this.toFill();
    }

    private void toFill(){
        if (!full) {
            full = true;
            System.out.println("Tank is filled!");
        }
        else {
            System.out.println("!!! Tank is already filled!");
        }
    }

    private void toEmpty(){
        if (full) {
            full = false;
            System.out.println("Tank is empty!");
        }
        else {
            System.out.println("!!! Tank is already empty!");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if (!full){
            System.out.println("*** ERROR - full tank is removed!!!");
        }
        else {
            System.out.println(":) - tank was removed successfully");
        }
        super.finalize();
    }

    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();

        tank1.toFill();
        tank2.toEmpty();

        new Tank().toEmpty();
        System.gc();
    }
}
