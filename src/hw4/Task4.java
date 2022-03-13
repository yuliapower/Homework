package hw4;

import java.util.Arrays;

//Задан одномерный массив целых чисел. Образуйте из него два отсортированных по возрастанию массива,
// содержащих четные и нечетные числа.
public class Task4 {
    public static void main(String[] args) {
        int[] arrayFourth = {2,8,-1,0,7,9,1,3,12};
        Arrays.sort(arrayFourth);
        System.out.println(Arrays.toString(arrayFourth));
        int evenElement = 0;
        int nonEvenElement = 0;
        for (int i = 0; i < arrayFourth.length; i++) {
            if (arrayFourth[i] % 2 == 0){
                evenElement++;
            }else {
                nonEvenElement++;
            }
        }

        System.out.println(evenElement);
        System.out.println(nonEvenElement);

        int[] firstArray = new int[evenElement];
        int[] secondArray = new int[nonEvenElement];
        int indexForFirstArray = 0;
        int indexForSecondArray = 0;
        for (int i = 0; i < arrayFourth.length; i++) {
            if (arrayFourth[i] % 2 == 0){
                firstArray[indexForFirstArray] = arrayFourth[i];
                indexForFirstArray++;
            }else {
                secondArray[indexForSecondArray] = arrayFourth[i];
                indexForSecondArray++;
            }
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }



}
