// src/utils/Helper.java
package utils;

public class Helper {
    public static int linearSearch(int target, int[] data) {
        System.out.println("pencarian...");
        for (int i = 0; i < data.length; i++) {
            System.out.println("index ke : " + i + " -> " + data[i]+" == "+target);
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
