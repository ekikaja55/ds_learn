// src/utils/Helper.java
package utils;

public class Helper {
    public static void menu() {
        System.out.println("\nMenu : ");
        System.out.println("1. Basic Array");
        System.out.println("2. Reverse Array");
        System.out.println("3. Linear Search");
        System.out.println("4. Linear Search Multiple Match");
        System.out.println("0. Exit ");
        System.out.print(">>> ");
    }

    public static int linearSearch(int target, int[] data) {
        System.out.println("pencarian...");
        for (int i = 0; i < data.length; i++) {
            System.out.println("index ke : " + i + " -> " + data[i] + " == " + target);
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
