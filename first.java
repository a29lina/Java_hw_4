package hw_java4;

import java.util.LinkedList;

public class first {
    public static void main(String[] args) {

        int[] arr = { 7, 4, 6, 9, 10, 13, 18, 32, 55, 46, 1, 10, 8 };
        LinkedList<Integer> lst = new LinkedList<Integer> ();
        for (int i = arr.length-1; i >=0; i--) {
            lst.add(arr[i]);
        }

        System.out.println(lst);
    }
    
}
