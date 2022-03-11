package hw3;

import java.util.Scanner;

//Задача на цикл
//Пользователь загадывает число в диапазоне от [2 до 100]
//Программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2).
//Программа может задавать пользователю вопросы: Число равно ...? / Число больше ...? / Число меньше ...? и в зависимоти от ответа пользователя принимать решения.
//Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int randomNumber = 2 + (int) (Math.random() * 98);
        // System.out.println(randomNumber);
        while (true) {
            int randomNumber = 2 + (int) (Math.random() * 98);
            System.out.println("Число равно " + randomNumber + " ?");
            int userNum = in.nextInt();
            if (userNum == 1) break;
            if (userNum == 0) {
                System.out.println("Число больше " + randomNumber + " ?");
                int userNum2 = in.nextInt();
                if (userNum2 == 1) {
                    //randomNumber = 50 + (int) (Math.random() * 98);
                    randomNumber =  randomNumber*2;
                    continue;
                }
                if (userNum2 == 0) {
                    System.out.println("Число меньше " + randomNumber + " ?");
                    int userNum3 = in.nextInt();
                    if (userNum3 == 0) break;
                    if (userNum3 == 1) {
                        //randomNumber = 2 + (int) (Math.random() * 49);
                        randomNumber =  randomNumber/ 2;
                        continue;
                    }
                }
            }
        }
    }
}
