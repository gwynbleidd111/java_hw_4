import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        LinkedList<Integer> newArray = getLinkedList(array);
        System.out.println();

        executeEnqueue(newArray);
        System.out.println("Результат: " + newArray);
        System.out.println();

        System.out.print(executeDequeue(newArray) + " ");
        System.out.println("- первый элемент из очереди. Результат: " + newArray);
        System.out.println();

        System.out.print(executeFirst(newArray) + " ");
        System.out.println("- первый элемент из очереди. Результат: " + newArray);
        System.out.println();
    }

    public static LinkedList<Integer> getLinkedList(int [] array) {
        LinkedList<Integer> newArray = new LinkedList<>();
        for (int index = 0; index < array.length; index++) {
            newArray.add(array[index]);
        }
        return newArray;
    }
    public static void executeEnqueue(LinkedList<Integer> array) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        array.addLast(n);
    }

    public static int executeDequeue(LinkedList<Integer> array) {
        int number = 0;
        number = array.get(0);
        array.remove(0);
        return number;
    }

    public static int executeFirst(LinkedList<Integer> array) {
        int number = 0;
        number = array.get(0);
        return number;
    }
}
