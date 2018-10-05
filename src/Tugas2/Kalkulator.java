/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author HP
 */
public class Kalkulator implements Operasi {

    private double bilangan1;
    private double bilangan2;
    private double hasil;

    public Kalkulator(double bilangan1, double bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    public double penjumlahan(){
        hasil = bilangan1+bilangan2;
        System.out.println("Hasil = " + hasil);
        return hasil;
    }
    public double perkalian(){
        hasil= bilangan1*bilangan2;
        System.out.println("Hasil = " + hasil);
        return hasil;
    }
    public double pengurangan(){
        hasil = bilangan1-bilangan2;
        System.out.println("Hasil = " + hasil);
        return hasil;
    }
    public double pembagian(){
        hasil = bilangan1/bilangan2;
        System.out.println("Hasil = " + hasil);
        return hasil;
    }
}
