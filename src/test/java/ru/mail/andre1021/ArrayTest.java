package ru.mail.andre1021;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {
    //Однострочный комментарий
    /*Многострочный коммент
Дан массив NxN. Напишите программу на Java которая находит минимальный элемент побочной диагонали, без учёта элемента пересечения главной и побочной диагонали.
Для примера приведена матрица 5х5. Побочная диагональ выделена жирным, минимальный элемент побочной диагонали – красным и подчеркнут:
1	2	3	4	5
5	7	9	2	1
0	9	1	8	7
6	3	6	6	6
99 	100	-2	3	1
     */
    @Test
    public void should_findMinValuePopochDiaganal_valusetwo(){
        MyArray1 array1 = new MyArray1();

        int [] pobochnayaDiagonal = array1.getPobochnayaDiagonalNotPeresechenie();
        int minPobochnayaDiagonal  = Arrays.stream(pobochnayaDiagonal).min().getAsInt();
        System.out.println("Минимальное значение побочной диаганали - " + minPobochnayaDiagonal);
        Assert.assertEquals(2, minPobochnayaDiagonal);
    }

    @Test
    public void should_CheckMernost(){
        MyArray1 array1 = new MyArray1();

        Assert.assertTrue(array1.getArray()[0][0] == 1);
        Assert.assertTrue(array1.getArray()[4][4] == 1);
    }
}
