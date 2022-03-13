package hw4;

import java.util.Arrays;

//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
// Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class Task3 {
    public static void main(String[] args) {
        int[]arrayThird = {-1,0,1,-1,0,1,1,-1,1,-1,1};
        System.out.println(Arrays.toString(arrayThird));
        int elem = Arrays.binarySearch(arrayThird, 1);
        System.out.println("Число 1 встречается в массиве "+elem+" раз");
    }
}
