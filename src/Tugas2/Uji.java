/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Uji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double bil1;
        double bil2;
        int ulangi;

        do {
            System.out.print("Masukkan bilangan pertama : ");
            bil1 = masuk.nextInt();
            System.out.print("Masukkan bilangan kedua : ");
            bil2 = masuk.nextInt();
            System.out.println("");

            Operasi kal = new Kalkulator(bil1, bil2);
            System.out.println("==================");
            System.out.println("Penjumlahan :");
            kal.penjumlahan();
            System.out.println("Pengurangan :");
            kal.pengurangan();
            System.out.println("Perkalian :");
            kal.perkalian();
            System.out.println("Pembagian :");
            kal.pembagian();
            System.out.println("==================");

            System.out.println("");
            System.out.println("Ulangi program ?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Jawab : ");
            ulangi = masuk.nextInt();
            System.out.println("");
            
        } while (ulangi == 1);
        System.out.println("Terima Kasih");

    }
}
