package hw2;

public class Task4 {
    public static void main(String[] args) {
        int age = 67, exp = 90;
        if (age>100){
            System.out.println("Мы Вам перезвоним");
        }else if (exp<5){
            System.out.println("Вы подходите на должность стажера");
        }else if (exp>=5){
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
