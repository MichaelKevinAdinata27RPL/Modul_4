/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingMethod;

/**
 *
 * @author HP
 */
public class Uji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RataRataNilai rn = new RataRataNilai();
        System.out.println("Rata rata nilai 21 dan 13 : " + rn.average(21, 13));
        System.out.println("Rata rata nilai 19.3 dan 39.5 : " + rn.average(19.3, 39.5));
        System.out.println("Rata rata nilai 123, 567 dan 744 : " + rn.average(123, 567, 744));
        
    }
    
}
