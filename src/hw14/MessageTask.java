package hw14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        int countLOW = 0;
        int countMEDIUM = 0;
        int countHIGH = 0;
        int countURGENT = 0;
        for (Message message : messageList) {

            if (message.getPriority().equals(MessagePriority.LOW)) {
                countLOW++;
            }
            if (message.getPriority().equals(MessagePriority.MEDIUM)) {
                countMEDIUM++;
            }
            if (message.getPriority().equals(MessagePriority.HIGH)) {
                countHIGH++;
            }
            if (message.getPriority().equals(MessagePriority.URGENT)) {
                countURGENT++;
            }

        }
        System.out.println("Количество сообщений для низкого приоритета: " + countLOW);
        System.out.println("Количество сообщений для среднего приоритета: " + countMEDIUM);
        System.out.println("Количество сообщений для высокого приоритета: " + countHIGH);
        System.out.println("Количество сообщений для срочного приоритета: " + countURGENT);
        //  Ответ в консоль
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        HashSet<Message> messageHashSet = new HashSet<>(messageList);
        System.out.println(messageHashSet.size());
    }
    //  Ответ в консоль


    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        LinkedHashSet<Message> messageLinkedHashSet = new LinkedHashSet<>(messageList);
        System.out.println(messageLinkedHashSet);
        return null;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

    public static void main(String[] args) {

    }

}