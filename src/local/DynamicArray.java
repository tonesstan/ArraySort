package local;

import java.util.ArrayList;

public class DynamicArray<T> extends ArrayList<T> {

    public static void print (DynamicArray<?> dynamicArray) {
        String string = dynamicArray.toString();
        if (string.length() > 2) {
            System.out.println(string.substring(1, string.length() - 1));
        } else {
            System.out.println("Array is empty!");
        }
    }

    public static DynamicArray<Integer> sort (DynamicArray<Integer> dynamicArray) {
        for (int i = 0; i < dynamicArray.size() - 1; i++) {
            for (int j = 0; j < dynamicArray.size() - i - 1; j++) {
                if (dynamicArray.get(j) > dynamicArray.get(j + 1)) {
                    int temp = dynamicArray.get(j);
                    dynamicArray.set(j, dynamicArray.get(j + 1));
                    dynamicArray.set(j + 1, temp);
                }
            }
        }
        return dynamicArray;
    }

}