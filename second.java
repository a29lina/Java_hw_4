package hw_java4;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class second {

    public static LinkedList<String> enqueue(LinkedList<String> list, String string) {
        list.addLast(string);
        System.out.println("Новая очередь: ");
        return list;
    }

    public static String dequeue(LinkedList<String> lst) {
        String firstElement = lst.getFirst();
        lst.pollFirst();
        return firstElement;
    }

    public static int first(ArrayDeque<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("1");
        lst.add("2");
        lst.add("3");

        enqueue(lst, "2");
        dequeue(lst);
        System.out.println(lst);

    }


}
