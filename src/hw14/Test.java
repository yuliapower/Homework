package hw14;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Message>messages = MessageGenerator.generate(10);
        System.out.println(messages);
        MessageTask.countEachPriority(messages);
        MessageTask.uniqueMessageCount(messages);
        MessageTask.uniqueMessagesInOriginalOrder(messages);
    }
}
