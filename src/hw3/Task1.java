package hw3;
//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task1 {
    public static void main(String[] args) {
        for (int count = 1,sequence = 1;count<=55;count++,sequence+=2){
            System.out.println(sequence);
        }
    }
}
