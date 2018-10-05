/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author HP
 */
public class Laki_Laki extends Manusia {
    
    private double TB;
    private double HtgBBI;

    public Laki_Laki(double TB) {
        this.TB = TB;
    }
    
    public double tinggiBadan(){
        return TB;
    }
    
    public double HtgBBI(){
        return (TB-100)-((TB-100)*0.1);
    }
    
}
