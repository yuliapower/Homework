package hw2;

public class Task3 {
    public static void main(String[] args) {
        int randomNumber = 10 + (int) (Math.random() * 500); //*490 - надо вычесть первый интервал
        if (randomNumber >= 25 && randomNumber <= 200) {
            System.out.println("Число " + randomNumber + " содержится в интервале (25;200)");
        } else {
            System.out.println("Число " + randomNumber + " не содержится в интервале (25;200)");
        }
        /*
        double randomValue = Math.random(); - диапозон [0;1)
        [3;7)   -7 не включаительно
        (int)(3+randomValue*4)
         */
    }
}
