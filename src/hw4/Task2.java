package hw4;

import java.lang.reflect.Array;
import java.util.Arrays;

//Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
public class Task2 {
    public static void main(String[] args) {
        int[] arraySecond = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = arraySecond.length - 1; i > 0; i--) {
            System.out.println(arraySecond[i]);
        }

    }
}
