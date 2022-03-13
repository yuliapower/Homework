package hw4;

import java.util.Arrays;

//Задать массив. Отрицательные элементы массива перенести в новый массив.
// Размер массива должен быть равен количеству отрицательных элементов.

public class Task5 {
    public static void main(String[] args) {
        int[] arrayFifth = {-1, -4, 7, 0, 4, -5, -3};
        int negativeElement = 0;
        for (int i = 0; i < arrayFifth.length; i++) {
            if (arrayFifth[i] < 0) {
                negativeElement++;
            }
        }
        System.out.println(negativeElement);
        int[] negativeArray = new int[negativeElement];
        int index = 0;
        for (int i = 0; i < arrayFifth.length; i++) {
            if (arrayFifth[i] < 0) {
                negativeArray[index] = arrayFifth[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(negativeArray));
    }

}
