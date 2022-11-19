package com.belajar;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Scanner input
    Scanner input = new Scanner(System.in);

    int angka1, angka2, hasil;

    System.out.println(" ===== Membuat Kalkulator Sederhana =====");

    // input
    System.out.print("Masukkan angka pertama: ");
    angka1 = input.nextInt();

    System.out.print("Masukkan angka kedua: ");
    angka2 = input.nextInt();

    // proses
    hasil = angka1 * angka2;

    // output
    System.out.printf("Hasil dari %d * %d = %d", angka1, angka2, hasil);

  }
  
}
