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
public class Kucing extends Hewan {

    @Override
    void setNama() {
        String kucing = "Carberus";
        System.out.println("Nama hewan : " + kucing);
    }

    @Override
    void setSuara() {
        String suara = "Miaw Meow Meong";
        System.out.println("Suara hewan : " + suara);
    }

    @Override
    void setBerat() {
        double berat = 2.0;
        System.out.println("Berat hewan : " + berat + "Kg");
    }

}
