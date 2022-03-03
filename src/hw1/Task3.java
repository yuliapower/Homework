package hw1;

public class Task3 {
    public static void main(String[] args) {
       /* float a = 45.6;
        long b = 60000;
        long c = a / b;
        */

        double a = 45.6;
        long b = 60000;
        double c =  a / b;

       /* int x = 34;
        long y = 78;
        int z = x / y;
        */

        int x = 34;
        long y = 78;
        int z = x / (int) y;

        /*
        double n = 90.8;
        double m = -100.1;
        int max = n > m ? n : m;
        */

        double n = 90.8;
        double m = -100.1;
        int max = (int) (n > m ? n : m);

        /*
        byte code = 1;
        boolean isActive = (boolean) code;
        */



        System.out.println(c);
        System.out.println(z);
        System.out.println(max);

    }
}
