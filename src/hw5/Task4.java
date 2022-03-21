package hw5;

//Определить, является ли срока полиндромом.
//
//Палиндром — это число, буквосочетание, слово или текст, которые одинаково
// читаются по буквам или по словам как слева направо, так и справа налево.
// Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
public class Task4 {
    public static void main(String[] args) {
        String palindrom = "20 2";
        String p = palindrom.replaceAll(" ","");
        StringBuilder stringBuilder = new StringBuilder(p);
        stringBuilder.reverse();
        String strPalidrom = stringBuilder.toString();
        System.out.println(strPalidrom.equalsIgnoreCase(p));
    }
}
