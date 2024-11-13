/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mi3c;

/**
 *
 * @author Reva Narendra
 */
import java.util.Scanner;
public class MI3C {
public static void main (String[]args){
int nilai1;
  System.out.println("program mulai");
  Scanner input = new Scanner(System.in); 
  System.out.print("Inputkan Nilai 1 : ");
  nilai1 = input.nextInt();

  for (int i = 1; i <= nilai1; i++) 
  {
    System.out.print(i);
  }

  System.out.println();
  System.out.println("program selesai");
 }
}
