package hw2;

public class Task1 {
    public static void main(String[] args) {
        int count = 32;
        if (count>=90&&count<=100){
            System.out.println("Отлично");
        }else if (count>=69&&count<=89){
            System.out.println("Хорошо");
        }else if (count>=40&&count<=59){
            System.out.println("Удовлетворительно");
        }else if (count>=0&&count<=39){
            System.out.println("Попробуйте в следующий раз");
        }

    }
}
