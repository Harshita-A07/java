//a)
  import java.util.*;

public class oddnum {
    public static <T> void printOddElements(T[] elements) {
        System.out.print("Odd elements:");
        for (T element : elements) {
            if (element instanceof Integer) {
                Integer number = (Integer) element;
                if (number % 2 != 0) {
                    System.out.print(" "+number);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {12, 3, 7, 18, 3,51,21,43};
        printOddElements(intArray);
    }
}
//b)
import java.util.Arrays;

public class GenericArraySwap {
    public static <T> void swapArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }

        for (int i = 0; i < array1.length; i++) {
            T temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Original Array 1: " + Arrays.toString(array1));
        System.out.println("Original Array 2: " + Arrays.toString(array2));

        swapArrays(array1, array2);

        System.out.println("Array 1 after swapping: " + Arrays.toString(array1));
        System.out.println("Array 2 after swapping: " + Arrays.toString(array2));
    }
}
//c)
import java.util.List;

public class MaxElement {
    public static <T extends Comparable<T>> T findMaxElementInRange(List<T> list, int begin, int end) {
        if (list == null || begin < 0 || end < begin || end >= list.size()) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        T maxElement = list.get(begin);

        for (int i = begin + 1; i <= end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(5, 12, 8, 15, 7, 10);
        int begin = 1;
        int end = 4;

        Integer maxElementInRange = findMaxElementInRange(integerList, begin, end);
        System.out.println("Maximal element in the range [" + begin + ", " + end + "]: " + maxElementInRange);

        List<String> stringList = List.of("apple", "banana", "cherry", "date", "fig");
        begin = 0;
        end = 2;

        String maxStringInRange = findMaxElementInRange(stringList, begin, end);
        System.out.println("Maximal string in the range [" + begin + ", " + end + "]: " + maxStringInRange);
    }
}
