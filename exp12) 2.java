//2)
public class Search {
    public static <T> int searchElement(T[] elements, T target) {
        if (elements == null || target == null) {
            return -1; // Element or array is not valid
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(target)) {
                return i; // Return the index of the found element
            }
        }

        return -1; // Element not found in the array
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer targetInt = 3;

        int resultInt = searchElement(intArray, targetInt);

        if (resultInt != -1) {
            System.out.println(targetInt + " found at index " + resultInt);
        } else {
            System.out.println(targetInt + " not found in the array");
        }

        String[] strArray = {"apple", "banana", "cherry", "date"};
        String targetStr = "banana";

        int resultStr = searchElement(strArray, targetStr);

        if (resultStr != -1) {
            System.out.println(targetStr + " found at index " + resultStr);
        } else {
            System.out.println(targetStr + " not found in the array");
        }
    }
}
