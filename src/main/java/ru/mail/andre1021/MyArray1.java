package ru.mail.andre1021;

public class MyArray1 {
    protected int [][] array;

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
}

class  MyArraySun extends MyArray1{
    public int [] [] array = super.array;
}