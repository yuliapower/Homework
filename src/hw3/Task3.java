package hw3;

import java.util.Scanner;

//Задача на цикл
//Программа загадывает число в диапазоне [1;9]
//Пользователь вводит число с клавиатуры
//Программа в зависимости от введенного числа выводит в консоль следующее:
//"загаданное число больше"
//"загаданное число меньше"
//"Вы угадали" (программа завершает работу)
//Если введен 0, выввести "выход из программы" (программа завершает работу)
public class Task3 {
    public static void main(String[] args) {
        int randomNumber = 1 + (int) (Math.random() * 8);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int userNum = in.nextInt();
        while (userNum != randomNumber) {
            if (userNum > randomNumber) {
                System.out.println("Загаданное число больше");
                System.out.println("Введите целое число");
                userNum = in.nextInt();
            } else if (userNum < randomNumber) {
                System.out.println("Загаданное число меньше");
                System.out.println("Введите целое число");
                userNum = in.nextInt();
            } else if (userNum == 0) {
                System.out.println("Выход из программы");
                break;
            } else if (userNum == randomNumber) ;
            {
                System.out.println("Вы угадали");
                break;
            }

        }
    }
}