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
public class balok extends persegipanjang {
    public double Tinggi ;
    public double Panjang ;
    public double Lebar ;
    public void setPanjangBalok(double nilaiBaru){
        this.Panjang=nilaiBaru;
    }
    public void setLebarBalok(double nilaiBaru){
        this.Lebar=nilaiBaru;
    }
    public void setTinggi(double nilaiBaru){
        this.Tinggi=nilaiBaru;
    }
    public double volumebalok (){
        return luaspersegipanjang()*Tinggi;
    }
    public double luaspermukaanbalok (){
        return 2 * ((Panjang*Lebar)+(Panjang*Tinggi)+(Lebar*Tinggi));
    }
    
}
