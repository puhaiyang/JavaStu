package com.haiyang.javastu.springtransactionmanager;

public class JavaTest {
    public static void main(String[] args) {
        int length = 3;

        int[][] array = new int[length][length];

        int max = length * length;

        int index = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = index++;
                }
            }
        }


    }
}
