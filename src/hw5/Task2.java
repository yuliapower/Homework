package hw5;

import java.util.Locale;

//Заменить все буквы в слове на строчные, а первую букву на заглавную.
// Например, дано hello, получаем Hello / дано HeLLO, получаем Hello.
public class Task2 {
    public static void main(String[] args) {
String a = "HeLLo";
String a1 = a.toLowerCase();
        String a2 = a1.substring(0,1).toUpperCase()+a1.substring(1);//можно не указывать последний индекс

        System.out.println(a2);
    }
}
