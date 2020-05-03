/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balok;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balok B = new Balok();
        int pilihan = 3;
        do {            
            Scanner input = new Scanner (System.in);
            System.out.println("Pilihlah Perhitungan Dibawah Ini yang Anda Inginkan"); 
            System.out.println("1. Menghitung Volume Balok");
            System.out.println("2. Menghitung Panjang Balok");
            System.out.println("3. Menghitung Lebar Balok");
            System.out.println("4. Menghitung Tinggi Balok");
            System.out.println("tekan '5' untuk berhenti!");
            System.out.println();
            System.out.println("Masukkan Pilihan Perhitungan: ");
            Scanner masukkan = new Scanner(System.in);
            pilihan = masukkan.nextInt();
            
            switch(pilihan){
                case 1 : 
                    System.out.println("Anda memilih Menghitung Volume Balok");
                    System.out.print("Masukkan Nilai Panjang : ");
                    float panjang=input.nextFloat();
                    System.out.print("Masukkan Nilai Lebar : ");
                    float lebar=input.nextFloat();
                    System.out.print("Masukkan Nilai Tinggi : ");
                    float tinggi=input.nextFloat();
        
                //Setter
                    B.setPanjang(panjang);
                    B.setLebar(lebar);
                    B.setTinggi(tinggi);
        
                //Getter
                    System.out.println();
                    System.out.println("Nilai Panjang Balok= " +B.getPanjang());
                    System.out.println("Nilai Lebar Balok= " +B.getLebar());
                    System.out.println("Nilai Tinggi Balok= "+B.getTinggi());
                    System.out.println();
                    System.out.println("Jadi Nilai Volume Balok = "+B.getVolumeBalok()); 
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("Anda memilih Menghitung Panjang Balok");
                    System.out.print("Masukkan Volume Balok : ");
                    float volume =input.nextFloat();
                    System.out.print("Masukkan Nilai Lebar : ");
                    float lebar1=input.nextFloat();
                    System.out.print("Masukkan Nilai Tinggi : ");
                    float tinggi1=input.nextFloat();
        
                //Setter
                    B.setVolume(volume);
                    B.setLebar1(lebar1);
                    B.setTinggi1(tinggi1);
        
                //Getter
                    System.out.println();
                    System.out.println("Nilai Volume Balok= " +B.getVolume());
                    System.out.println("Nilai Lebar Balok= " +B.getLebar());
                    System.out.println("Nilai Tinggi Balok= "+B.getTinggi());
                    System.out.println();
                    System.out.println("Jadi Nilai Panjang Balok = "+B.getPanjangBalok());
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("Anda memilih Menghitung Lebar Balok");
                    System.out.print("Masukkan Volume Balok : ");
                    float volume1 =input.nextFloat();
                    System.out.print("Masukkan Nilai Panjang : ");
                    float panjang1=input.nextFloat();
                    System.out.print("Masukkan Nilai Tinggi : ");
                    float tinggi2=input.nextFloat();
        
                //Setter
                    B.setVolume1(volume1);
                    B.setPanjang1(panjang1);
                    B.setTinggi2(tinggi2);
        
                //Getter
                    System.out.println();
                    System.out.println("Nilai Volume Balok= " +B.getVolume1());
                    System.out.println("Nilai Panjang Balok= " +B.getPanjang1());
                    System.out.println("Nilai Tinggi Balok= "+B.getTinggi2());
                    System.out.println();
                    System.out.println("Jadi Nilai Lebar Balok = "+B.getLebarBalok());
                    System.out.println();
                    break;
                case 4 :
                    System.out.println("Anda memilih Menghitung Tinggi Balok");
                    System.out.print("Masukkan Volume Balok : ");
                    float volume2 =input.nextFloat();
                    System.out.print("Masukkan Nilai Panjang : ");
                    float panjang2=input.nextFloat();
                    System.out.print("Masukkan Nilai Lebar : ");
                    float lebar2=input.nextFloat();
                //Setter
                    B.setVolume2(volume2);
                    B.setPanjang2(panjang2);
                    B.setLebar2(lebar2);
                //Getter
                    System.out.println();
                    System.out.println("Nilai Volume Balok= " +B.getVolume2());
                    System.out.println("Nilai Panjang Balok= " +B.getPanjang2());
                    System.out.println("Nilai Lebar Balok= "+B.getLebar2());
                    System.out.println();
                    System.out.println("Jadi Nilai Tinggi Balok = "+B.getTinggiBalok());
                    System.out.println();
                    break;   
                    
                } 
        }while (pilihan!=5);
      
    }
}