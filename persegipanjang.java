/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheribalok;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class persegipanjang {
    public double Panjang ;
    public double Lebar ;
    public void setPanjang(double nilaiBaru){
        this.Panjang=nilaiBaru;
    }
    public void setLebar(double nilaiBaru){
        this.Lebar=nilaiBaru;
    }
    public double luaspersegipanjang(){
        return (Panjang * Lebar);
    }
    public double kelilingpersegipanjang(){
        return (4 * (Panjang + Lebar));
    }
    
}
