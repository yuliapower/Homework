package hw15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        // TODO:: написать статический метод, который приннимает на вход мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        addList(firstTaskMap, "Тверь"); //[asd, rty, qwe]

        // TODO:: дан список слов (words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов
        //  в списке вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may"); //4
        words.add("august");//3
        words.add("june"); //1
        words.add("may");
        words.add("may");
        words.add("july"); //1
        words.add("may");
        words.add("august");
        words.add("august");

        wordMap(words); //{june=1, may=4, august=3, july=1}


        // TODO:: дана мапа (customerMap).
        //  Написать статический метод, который принимает на вход агрументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        customers(18, 50, customerMap); //{1=Customer{name='Павел', uuid='1', age=23}, 3=Customer{name='Максим', uuid='3', age=48}}

        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту
        //  встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы
        //  по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
String[] textSplit = text.split(" ");
text1("web", textSplit);

    }
    // 1.
    public static void text1(String word, String[] strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int integer = 0;
        for (String string : strings) {
            if (!hashMap.containsKey(string)) {
                hashMap.put(string, integer);
            }
            if (hashMap.containsKey(string)) {
                for (Map.Entry<String, Integer> pair : hashMap.entrySet())
                    if (pair.getKey().equals(string)) hashMap.put(pair.getKey(), pair.getValue() + 1);
            }
        }
        System.out.println(hashMap.get(word));
        System.out.println(hashMap);
    }
// 2.
    public static void text2(String[] strings){
        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
      //  List<String> words = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()=strings[i+1].length()){
                ArrayList<String> list = new ArrayList<>();
                list.add(strings[i]);
            }
        }
        for (Map.Entry<Integer, ArrayList<String>> pair : hashMap.entrySet()){
            if (!pair.getKey()){
                ArrayList<String> list = new ArrayList<>();
                strings.add(string)
            }
        }
    }
    // for (User user : hashMap.values()) {
    //            if (!ageMap.containsKey(user.getAge())) {
    //                ArrayList<User> users = new ArrayList<>();
    //                users.add(user);
    //                ageMap.put(user.getAge(), users);
    //            } else { //если такой ключ есть добавляем пользователя в сущ список
    //                ageMap.get(user.getAge()).add(user);
    //            }
    //        }





    // TODO:: написать статический метод, который приннимает на вход мапу (firstTaskMap) и город (city) +
    //  и формирует список (List) логинов, которые соответствуют переданному городу

    public static void addList(HashMap<String, String> hashMap, String city) {
        List<String> logins = new ArrayList<>();
        for (Map.Entry<String, String> pair : hashMap.entrySet()) {
            if (pair.getValue().equals(city)) {
                logins.add(pair.getKey());
            }
        }
        System.out.println(logins);
    }

    // TODO:: дан список слов (words).
    //  Написать статический метод, который будет возвращать количество одинаковых слов
    //  в списке вида Map<String, Integer>, где String - слово и Integer - количество повторений +

    public static void wordMap(List<String> list) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int integer = 0;
        for (String string : list) {
            if (!hashMap.containsKey(string)) {
                hashMap.put(string, integer);
            }
            if (hashMap.containsKey(string)) {
                for (Map.Entry<String, Integer> pair : hashMap.entrySet())
                    if (pair.getKey().equals(string)) hashMap.put(pair.getKey(), pair.getValue() + 1);
            }
        }
        System.out.println(hashMap);
    }

    // TODO:: дана мапа (customerMap).
    //  Написать статический метод, который принимает на вход агрументы int from и int to и возвращает
    //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to) +
    public static void customers(int from, int to, HashMap<String, Customer> customerMap) {
        HashMap<String, Customer> customerMapCopy = new HashMap<>();
        for (Map.Entry<String, Customer> pair : customerMap.entrySet()) {
            if (pair.getValue().getAge() >= from && pair.getValue().getAge() <= to) {
                customerMapCopy.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println(customerMapCopy);
    }
}
