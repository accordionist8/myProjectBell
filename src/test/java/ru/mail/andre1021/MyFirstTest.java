package ru.mail.andre1021;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class MyFirstTest {
    Emploers emploers = new Emploers();

    @Test
    public void test_1() {
        System.out.println("Hello world!!!");
    }

    @Test
    //("Вывод имен всех сотрудников, младше 30.")
    public void should_printName_getTwo() {
        List result = emploers.getNameByAge(30);

        result.forEach(System.out::println);

        Assert.assertEquals(2, result.size());
    }
    @Test
    //("Вывод имен всех сотрудников, получающих зарплату в рублях")
    public void should_printNamebyZpRub_getTwo() {
        List result = emploers.getNameByZP("руб");

        result.forEach(System.out::println);

        Assert.assertEquals(2, result.size());
    }

    @Test
    //("Вывод среднего возраста всех сотрудников")
    public void should_printName_get() {
        int result = emploers.getMidleAge();

        System.out.println("Средний возраст сотрудников - " + result);

        Assert.assertEquals(30, result);
    }
    @Test
    public void should_getEmploesList_Size4() {
        List tmp = emploers.getListEmploers();
        int size = tmp.size();
        Assert.assertEquals(4, size);
    }

    @Test//минимальный элемент побочной диагонали
    public void minobjectarea() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}};

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

            }
        }

        int min = IntStream.range(0, matrix.length - 1)
                .map(i -> matrix[i][matrix.length - 2 - i])
                .min()
                .getAsInt();
        System.out.println(min);
    }
}
