package ru.mail.andre1021;

import java.util.Random;

public class MyArray1 {
    protected int [][] array;
    private int N;

    public int[][] getArray() {
        return array;
    }

    public MyArray1() {
        this.array = new int[][]{
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };
    }

    public int[] getPobochnayaDiagonalNotPeresechenie() {
        int[] result = new int[4];
        int i = 0;
        int stroka = 0;
        int stolbech = 4;

        for (int ii = 0; ii < array.length; ii++) {
            if(ii != 2) {
                result[i++] = array[stroka][stolbech];
            }
            stroka++;
            stolbech--;
        }

        return result;
    }

    public int[][][] getCube(int N) {
        this.N = N;
        int[][][] cube = new int[N][N][N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    cube[i][j][k] = random.nextInt(100) + 1;
                }
            }
        }
        return cube;
    }

    public int getMinDiaganalCube(int[][][] cube) {
        int [] result = new int[N * 3];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    //cube[i][j][k];
                }
            }
        }
        return 0;
    }
}

class  MyArraySun extends MyArray1{
    public int [] [] array = super.array;
}