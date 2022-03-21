package hw5;
//Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
// и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
// В итоге в массиве будут только уникальные слова.
//Выход их программы по слову exit (слово 'exit' в массив не добавлять)
// или если массив заполнен Перед завершением программы, вывести получившийся массив в консоль

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        System.out.println(Arrays.toString(array));
        int size = 0;
        int index = 0;
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println(Arrays.toString(array));
                break;
            }
            for (String element : array) {
                if (str.equals(element)) {
                    System.out.println("Tакой элемент уже есть");
                    index--;
                    size--;
                    break;
                }
            }
            array[index] = str;
            index++;
            size++;
            System.out.println(Arrays.toString(array));
            if (array.length == size) {
                System.out.println("Массив переполнен,пока");
                break;
            }
        }
    }
}
