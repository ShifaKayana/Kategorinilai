/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabanganifrpl8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class kategorinilai {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Nilai "+nama);
        int nilai = input.nextInt();
        
        String predikat = null,kategori = null;
        if(nilai > 96 && nilai <= 100){
            predikat = "A+";
            kategori = "Sangat baik";
        }else if(nilai > 91 && nilai <= 95){
            predikat = "A-";
            kategori = "Sangat baik";
        }else if(nilai > 86 && nilai <= 90){
            predikat = "B+";
            kategori = "Baik";
        }else if(nilai > 81 && nilai <= 85){
            predikat = "B";
            kategori = "Baik";
        }else if(nilai > 75 && nilai <= 80){
            predikat = "B-";
            kategori = "Baik";
        }else if(nilai > 70 && nilai <= 74){
            predikat = "C+";
            kategori = "Cukup";
        }else if(nilai > 65 && nilai <= 69){
            predikat = "C";
            kategori = "Cukup";
        }else if(nilai > 60 && nilai <= 64){
            predikat = "C-";
            kategori = "Cukup";
        }else if(nilai > 55 && nilai <= 59){
            predikat = "D+";
            kategori = "Kurang";
        }else if(nilai > 0 && nilai <=54){
            predikat = "D";
            kategori = "kurang";
        }
        System.out.println("Nama :"+ nama);
        System.out.println("Nilai :"+ nilai);
        System.out.println(predikat);
        System.out.println(kategori);
    }
}
