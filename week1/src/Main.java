
// src/Main.java
import java.util.Scanner;

import utils.Helper;

public class Main {
    public static void main(String[] args) {

        // inisiasi array secara langsung sak valuenya
        int[] daftarAngka = { 5, 3, 7, 3, 9, 3, 2, 8, 3, 1 };
        String[] daftarNama = {
                "ekik", "Dani", "Ilham", "EKIK", "Dian", "eKiK", "Rizki"
        };

        Scanner s = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        boolean start = true;
        int hasilInt;
        int[] hasilArrayInt;
        int inputanInt;
        String inputanStr;
        String hasilStr;
        String[] hasilArrayString;

        while (start) {
            Helper.menu();
            inputanInt = Helper.cekInputInt(s, "Pilih Menu ", ">>> ");
            switch (inputanInt) {
                case 0:
                    System.out.println("Process Exit...");
                    start = false;
                    break;

                case 1:
                    System.out.println("isi array integer :");
                    Helper.printArrayInt(daftarAngka);
                    break;
                case 2:
                    System.out.println("Reverse Array : ");
                    int[] hasilArr = Helper.reversedArray(daftarAngka);

                    System.out.println("Hasil Reverse Array : ");
                    Helper.printArrayInt(hasilArr);
                    break;
                case 3:
                    inputanInt = Helper.cekInputInt(s, "Linear Search :", "Masukan Inputan : ");
                    int hasil = Helper.linearSearch(inputanInt, daftarAngka);
                    if (hasil == -1) {
                        System.out.println("Inputan tidak ditemukan : " + hasil);
                        break;
                    }

                    System.out.println(
                            "hasil dari linear search : " + "index ke - " + hasil + " = " + daftarAngka[hasil]);

                    break;
                case 4:
                    inputanInt = Helper.cekInputInt(s, "Linear Search Multiple Data Integer : ", "Masukan Inputan : ");
                    hasilArrayInt = Helper.multipleSearchInteger(inputanInt, daftarAngka);
                    for (int i = 0; i < hasilArrayInt.length; i++) {
                        if (hasilArrayInt[i] != 0) {
                            System.out.println("index ke - " + i + " -> " + daftarAngka[i]);
                        }
                    }
                    break;

                case 5:
                    inputanStr = Helper.cekInputString(k, "Linear Search ", "Masukan Inputan :");
                    System.out.println(inputanStr);
                    hasilArrayInt = Helper.multipleSearchString(inputanStr, daftarNama);
                    for (int i = 0; i < hasilArrayInt.length; i++) {
                        System.out.println("index ke - " + i + " -> " + daftarNama[i]);
                    }
                    break;
                case 6:
                    inputanStr = Helper.cekInputString(k, "String Reversal ", "Masukan Inputan :");
                    System.out.println(inputanStr);
                    hasilArrayString = Helper.reversedString(inputanStr);
                    Helper.printArrayString(hasilArrayString);
                    break;
                default:
                    System.out.println("Inputan Tidak Valid ");
                    break;
            }
        }
        s.close();

    }
}