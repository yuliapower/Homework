package hw2;

public class Task2 {
    public static void main(String[] args) {
        double firstOperand = 1.0, secondOperand = 2.0;
        int operator = 3;
        switch (operator) {
            case 3:
                System.out.println(firstOperand + secondOperand);
                break;
            case 5:
                System.out.println(firstOperand-secondOperand);
                break;
            case 7:
                System.out.println(firstOperand*secondOperand);
                break;
            case 9:
                System.out.println(firstOperand/secondOperand);
                break;
        }
    }
}
