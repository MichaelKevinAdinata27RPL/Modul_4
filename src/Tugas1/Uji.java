/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

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
        double tb;
        int jl;
        int ulangi;
        do {
            System.out.println("=====Hitung Berat Badan Ideal=====");
            System.out.print("Masukkan tinggi badan (cm) : ");
            tb = masuk.nextInt();
            System.out.println("Pilh jenis kelamin : ");
            System.out.println("1. Laki-Laki");
            System.out.println("2. Perempuan");
            System.out.print("Jawab : ");
            jl = masuk.nextInt();
            System.out.println("");

            switch (jl) {
                case 1:
                    System.out.println("================================================");
                    Manusia lk = new Laki_Laki(tb);
                    System.out.println("Tinggi badan (cm) : " + lk.tinggiBadan() + " cm");
                    System.out.println("Jenis kelamin : Laki-Laki");
                    System.out.println("Berat badan ideal : " + lk.HtgBBI() + " kg");
                    System.out.println("================================================");
                    break;
                case 2:
                    System.out.println("================================================");
                    Manusia pr = new Perempuan(tb);
                    System.out.println("Tinggi badan (cm) : " + pr.tinggiBadan() + " cm");
                    System.out.println("Jenis kelamin : Perempuan");
                    System.out.println("Berat badan ideal : " + pr.HtgBBI() + " kg");
                    System.out.println("================================================");
            }
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
