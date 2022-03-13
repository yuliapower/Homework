package hw4;

import java.util.Arrays;

//Заполните массив на N элементов случайным целыми числами и выведете максимальное, минимальное и среднее значение
public class Task1 {
    public static void main(String[] args) {
       // int[] arrayMain = {4, 3, -6, 0, -4};
        int n = 6;
        int [] arrayMain = new int[n];
        for (int i = 0; i < arrayMain.length; i++) {
            arrayMain[i] = (1+(int)(Math.random() * 34));
        }
        System.out.println(Arrays.toString(arrayMain));
        int minValue = arrayMain[0];
        int maxValue = arrayMain[0];
        int middleValue = 0;
        for (int i = 0; i < arrayMain.length; i++) {
            if (minValue > arrayMain[i]) minValue = arrayMain[i];
            if (maxValue < arrayMain[i]) maxValue = arrayMain[i];
            middleValue = middleValue + arrayMain[i];
        }
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(middleValue / arrayMain.length);

    }
}
