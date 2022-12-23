import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        System.out.println("Реверс: " + reverseLinkedList(array));
    }

    public static LinkedList<Integer> reverseLinkedList(int [] array) {
        LinkedList<Integer> newArray = new LinkedList<>();
        for (int index = 0; index < array.length; index++) {
            newArray.add(array[index]);
        }
        Collections.reverse(newArray);
        return newArray;
    }
}
