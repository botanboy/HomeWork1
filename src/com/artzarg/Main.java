package com.artzarg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Первое задание
        ArrayList<Integer> x = new ArrayList<>();
        int three = 0;
        for(int a = 0; a < 1000; a++ )
        if (a % 3 == 0){
            x.add(a);
            three += a;
        }
        System.out.println("Первое задание \n " + three);

        //Второе задание
        int[][] x1 = new int[][]{ {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
            int max = 0;
            int min = x1[0][0];
            for (int i = 0; i < x1.length; i ++){
                for (int j = 0; j < x1[i].length; j++ ) {
                    if (x1[i][j] < min) {
                        min = x1[i][j];
                    }
                }
            }
            System.out.println("Второе задание: ");
            System.out.println(min);




    }

}