/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author HP
 */
public class AbstractSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bangunDatar objek1 = new bujurSangkar(10);
        System.out.println("Luas bujur sangkar dengan sisi 10 : " + objek1.hitungLuas());
        System.out.println("Kelilingnya : " + objek1.hitungKeliling());
        System.out.println("\n");
        
        bangunDatar objek2 = new Lingkaran(7);
        System.out.println("Luas lingkarang dengan jari-jari 7 : " + objek2.hitungLuas());
        System.out.println("Kelilingnya : " + objek2.hitungKeliling());
        System.out.println("\n");
        
        
        
    }
    
}
