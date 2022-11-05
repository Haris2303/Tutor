package com.belajar;

import java.util.ArrayList;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    // membuat variabel
    // int angka = 10;

    // System.out.println("Angka = " + angka);
    // System.out.printf("Angka = %d", angka);


    // double phi = 3.14;
    // double hasil = phi * (7 * 7);

    // // System.out.println("Nilai dari phi = " + phi);
    // System.out.println("Hasil = " + hasil);


    // String namaAwal = "Otong Surotong";
    // String namaAkhir = " Cepmek";

    // System.out.println(namaAwal + namaAkhir);

    // membuat variabel input dari Scanner
    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan angka: ");
    int angka = inputUser.nextInt();

    System.out.println("Angka yang anda masukkan adalah = " + angka);

    // close scanner
    inputUser.close();

  }
  
}
