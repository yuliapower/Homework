package hw2;

public class Task3 {
    public static void main(String[] args) {
        int randomNumber = 10 + (int) (Math.random() * 500);
        if (randomNumber >= 25 && randomNumber <= 200) {
            System.out.println("Число " + randomNumber + " содержится в интервале (25;200)");
        } else {
            System.out.println("Число " + randomNumber + " не содержится в интервале (25;200)");
        }
    }
}
