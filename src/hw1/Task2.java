package hw1;

public class Task2 {
    public static void main(String[] args) {
        int firstNumber = 45;
        int secondNumber = 11;
        int a = firstNumber % 10;
        int b = firstNumber / 10;
        int firstNumberSum = a + b;
        int c = secondNumber % 10;
        int d = secondNumber / 10;
        int secondNumberSum = c + d;
        System.out.println(firstNumberSum);
        System.out.println(secondNumberSum);
    }
}
