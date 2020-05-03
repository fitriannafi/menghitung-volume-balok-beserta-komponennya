/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balok;

/**
 *
 * @author ASUS
 */
public class Balok {
    private float panjang;
    private float lebar;
    private float tinggi;
    private float panjang1;
    private float lebar1;
    private float tinggi1;
    private float volume;
    private float volume1;
    private float tinggi2;
    private float volume2;
    private float panjang2;
    private float lebar2;

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getPanjang1() {
        return panjang1;
    }

    public void setPanjang1(float panjang1) {
        this.panjang1 = panjang1;
    }

    public float getLebar1() {
        return lebar1;
    }

    public void setLebar1(float lebar1) {
        this.lebar1 = lebar1;
    }

    public float getTinggi1() {
        return tinggi1;
    }

    public void setTinggi1(float tinggi1) {
        this.tinggi1 = tinggi1;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getVolume1() {
        return volume1;
    }

    public void setVolume1(float volume1) {
        this.volume1 = volume1;
    }

    public float getTinggi2() {
        return tinggi2;
    }

    public void setTinggi2(float tinggi2) {
        this.tinggi2 = tinggi2;
    }
    
    public float getVolume2() {
        return volume2;
    }

    public void setVolume2(float volume2) {
        this.volume2 = volume2;
    }

    public float getPanjang2() {
        return panjang2;
    }

    public void setPanjang2(float panjang2) {
        this.panjang2 = panjang2;
    }

    public float getLebar2() {
        return lebar2;
    }

    public void setLebar2(float lebar2) {
        this.lebar2 = lebar2;
    }


    public double getVolumeBalok(){
        double volumebalok;
        volumebalok = panjang*lebar*tinggi;
        return volumebalok;
    }
    public double getPanjangBalok(){
        double panjangbalok;
        panjangbalok = volume/(lebar1*tinggi1);
        return panjangbalok;
    }
    public double getLebarBalok(){
        double lebarbalok;
        lebarbalok = volume1/(panjang1*tinggi2);
        return lebarbalok;
    }
    public double getTinggiBalok(){
        double tinggibalok;
        tinggibalok = volume2/(panjang2*lebar2);
        return tinggibalok;
    }
}
