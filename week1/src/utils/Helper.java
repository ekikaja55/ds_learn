// src/utils/Helper.java
package utils;

import java.util.List;
import java.util.Scanner;

public class Helper {
    public static void menu() {
        System.out.println("\nMenu : ");
        System.out.println("1. Basic Array");
        System.out.println("2. Reverse Array");
        System.out.println("3. Linear Search Integer");
        System.out.println("4. Linear Search Multiple Match");
        System.out.println("5. Linear Search String");
        System.out.println("6. String Reversal");

        System.out.println("0. Exit\n");
    }

    // selama dia true jalanin whilenya lalu return dan pakai next() buat "bersihin"
    // inputan
    public static int cekInputInt(Scanner s, String title, String teks) {
        while (true) {
            System.out.println(title);
            System.out.print(teks);
            if (s.hasNextInt()) {
                return s.nextInt();
            } else {
                System.out.println("\nInput harus angka!");
                s.next();
            }
        }
    }

    public static String cekInputString(Scanner s, String title, String teks) {
        while (true) {
            System.out.println(title);
            System.out.print(teks);
            if (s.hasNextLine()) {
                return s.nextLine();
            } else {
                System.out.println("\nInput harus string!");
                s.next();
            }
        }
    }

    public static void printArrayInt(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("index ke - " + i + " -> " + data[i]);
        }

        System.out.println("Index Pertama  : " + data[0]);
        System.out.println("Index Terakhir : " + data[data.length - 1]);

    }

    public static void printArrayString(String[] data) {
        System.out.println("isi array string :");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " - ");
        }
    }

    // ambil param array int terus reverse
    // contoh : 5, 3, 7, 3, 9, 3, 2, 8, 3, 1
    public static int[] reversedArray(int[] data) {
        int[] reversedArray = new int[data.length];
        int kanan = reversedArray.length - 1;
        int kiri = 0;
        System.out.println("Panjang data array " + reversedArray.length);
        System.out.println("Debugging...");
        while (kiri <= reversedArray.length - 1) {

            reversedArray[kiri] = data[kanan];
            // proses debug biar enak liatnya
            System.out.println(
                    "index kiri : " + kiri + " -> " + reversedArray[kiri] + " - " + "index kanan : " + kanan + " -> "
                            + data[kanan]);
            kiri++;
            kanan--;

        }
        return reversedArray;
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

    public static int[] multipleSearchInteger(int target, int[] data) {
        int[] indexHasil = new int[data.length];
        for (int i = 0; i < indexHasil.length; i++) {
            if (target == data[i]) {
                indexHasil[i] = i;
            }
        }
        return indexHasil;
    }

    public static int[] multipleSearchString(String target, String[] data) {
        int[] indexHasil = new int[data.length];
        for (int i = 0; i < indexHasil.length; i++) {
            if (data[i].equalsIgnoreCase(target)) {
                indexHasil[i] = i;
            }
        }

        return indexHasil;
    }

    public static String[] reversedString(String data) {
        String[] temp = data.split("");
        String[] reversedString = new String[temp.length];
        int kanan = temp.length - 1;
        int kiri = 0;
        System.out.println("Panjang data array string " + temp.length);
        System.out.println("Debugging...");
        while (kiri <= reversedString.length - 1) {
            reversedString[kiri] = temp[kanan];
            // proses debug biar enak liatnya
            System.out.println(
                    "index kiri : " + kiri + " -> " + reversedString[kiri] + " - " + "index kanan: " + kanan + " -> "
                            + temp[kanan]);
            kiri++;
            kanan--;

        }
        return reversedString;
    }

}
