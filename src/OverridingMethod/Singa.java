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
public class Singa extends Hewan {

    @Override
    void setNama() {
        String singa = "Diablo";
        System.out.println("Nama hewan : " + singa);
    }

    @Override
    void setSuara() {
        String suara = "Roaaaaar";
        System.out.println("Suara hewan : " + suara);
    }

    @Override
    void setBerat() {
        double berat = 10.0;
        System.out.println("Berat hewan : " + berat + "Kg");
    }
}
