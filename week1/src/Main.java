
// src/Main.java
import java.util.Scanner;

import utils.Helper;

public class Main {
    public static void main(String[] args) {

        // inisiasi array secara langsung sak valuenya
        int[] daftarAngka = { 10, 20, 30, 40, 50 };
        Scanner s = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        boolean start = true;

        while (start) {
            System.out.println("\nMenu : ");
            System.out.println("1. Basic Array");
            System.out.println("2. Reverse Array");
            System.out.println("3. Linear Search");
            System.out.println("4. Linear Search Multiple Match");
            System.out.println("0. Exit ");
            System.out.print(">>> ");
            int input = s.nextInt();

            switch (input) {
                case 0:
                    System.out.println("Process Exit...");
                    start = false;
                    break;

                case 1:
                    System.out.println("isi array angka :");

                    for (int i = 0; i < daftarAngka.length; i++) {
                        System.out.println("index ke - " + daftarAngka[i]);
                    }

                    System.out.println("Index Pertama : " + daftarAngka[0]);
                    System.out.println("Index Pertama : " + daftarAngka[daftarAngka.length - 1]);

                    break;
                case 2:

                    System.out.println("Reverse Array : ");
                    for (int i = daftarAngka.length - 1; i >= 0; i--) {

                        System.out.println("index ke : " + i + " -> " + daftarAngka[i]);
                    }
                    break;
                case 3:
                    System.out.println("Linear Search : ");
                    System.out.print("Masukan Inputan : ");
                    if (!s.hasNextInt()) {
                        System.out.println("Inputan Harus Berupa Angka  ");
                        s.next();
                        break;
                    }

                    int inputan = s.nextInt();
                    int hasil = Helper.linearSearch(inputan, daftarAngka);

                    if (hasil == -1) {
                        System.out.println("Inputan tidak ditemukan : " + hasil);
                        break;
                    }

                    System.out.println("hasil dari linear search : " + hasil);

                    break;
                default:
                    System.out.println("Inputan Tidak Valid ");
                    break;
            }
        }
        s.close();

    }
}