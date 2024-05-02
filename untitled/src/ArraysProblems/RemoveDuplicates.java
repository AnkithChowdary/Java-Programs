package ArraysProblems;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 1};
        int[] result = removeDuplicates(array);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;
    }
}
