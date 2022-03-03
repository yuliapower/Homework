package hw1;

public class Task1 {
    public static void main(String[] args) {
        int sum = 100001;
        double res = sum >= 100000 ? sum * 0.9 : sum;
        System.out.println(res);
    }
}
