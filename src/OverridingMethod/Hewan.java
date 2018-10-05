/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverridingMethod;

/**
 *
 * @author HP
 */
public class Hewan {
    void setNama(){
        String hewan = "Tidak Bernama";
        System.out.println("Nama hewan : " + hewan);
    }
    
    void setSuara(){
        String suara = "Tidak Bersuara";
        System.out.println("Suara hewan : " + suara);
    }
    
    void setBerat(){
        double berat = 0.0;
        System.out.println("Berat hewan : " + berat + "Kg");
    }
}
