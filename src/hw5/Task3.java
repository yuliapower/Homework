package hw5;

//Найдите самое длинное слово в предложении, при условии,
// что в предложении все слова разной длины.
// Предложение для поска длинного слова: "в предложении все слова разной длины".
public class Task3 {
    public static void main(String[] args) {
        String str = "в предложении все слова разной длины";
        String[] strings = str.split(" ");

        int max = 0;
        String maxWord = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > max) {
                max = strings[i].length();
                maxWord = strings[i];
            }
        }
        System.out.println(maxWord);

    }
}
