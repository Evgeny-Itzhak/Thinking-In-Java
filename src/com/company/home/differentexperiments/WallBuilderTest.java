package com.company.home.differentexperiments;

import java.util.Arrays;

/**
 * @author  Itzhak-Miryam on 23.02.2016.
 */
public class WallBuilderTest {

    public static void main(String[] args) {

        fillWallWithZero();
        //testArray();

    }

    static void fillWallWithZero() {
        int maxRows=0;
        int[][] currentWall = new int[3][3];
        for (int row = 0; row < currentWall.length; row++) {
            for (int column = 0; column < currentWall[row].length; column++) {
                currentWall[row][column] = column + 1;
                System.out.print(currentWall[row][column]);
            }
            maxRows = row;
            System.out.println();
        }
        //System.out.println(Arrays.toString(currentWall));
        System.out.println("\n********\n");

        int[][] newArray = new int[currentWall.length][currentWall[maxRows].length];
        for (int row = 0; row < currentWall.length; row++) {
            for (int column = 0; column < currentWall[row].length; column++){
                newArray[row][column]=currentWall[column][row];
            }
        }

        System.out.println(Arrays.deepToString(newArray));
        System.out.println();

        //System.out.println("\n********\ncurrentWallLength = " + currentWall.length);
    }

    static void testArray(){
        int[] array = new int[5];

        Arrays.fill(array, 1);

        System.out.println(Arrays.toString(array));

    }

}

