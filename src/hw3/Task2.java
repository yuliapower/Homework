package hw3;

import java.util.Scanner;

//Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        System.out.println("Сумма = " + (sum));

    }
}
