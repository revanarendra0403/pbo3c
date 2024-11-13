package com.mycompany.mi3c;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reva Narendra
 */
import java.util.Scanner; 

public class lat1 { 


    public static void cekKelulusan(String nama, String nim, float nilai) {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Nilai          : " + nilai);


        if (nilai > 55) {
            System.out.println("Keterangan     : LULUS");
        } else {
            System.out.println("Keterangan     : GAGAL");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Nilai: ");
        float nilai = input.nextFloat();

        cekKelulusan(nama, nim, nilai);
    }
}
