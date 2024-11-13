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
public class lat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contoh array integer
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        
        // Meminta input nilai yang akan dicari
        System.out.print("Masukkan nilai yang akan dicari: ");
        int nilaiDicari = scanner.nextInt();
        
        // Variabel untuk melacak apakah nilai ditemukan
        boolean ketemu = false;
        
        // Pencarian nilai dalam array
        for (int nilai : array) {
            if (nilai == nilaiDicari) {
                ketemu = true;
                break;
            }
        }
        
        // Output hasil pencarian
        if (ketemu) {
            System.out.println("KETEMU");
        } else {
            System.out.println("TIDAK KETEMU");
        }
        
}

}
