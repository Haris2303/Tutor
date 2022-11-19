package com.belajar;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    // Menghitung luas persegi panjang

    // membuat scanner
    Scanner inputUser = new Scanner(System.in);

    // deklarasi variabel
    int panjang, lebar, hasil;

    System.out.println(" ====== Menghitung Luas Persegi Panjang ===== ");

    // input
    System.out.print("Masukkan panjang: ");
    panjang = inputUser.nextInt();

    System.out.print("Masukkan lebar: ");
    lebar = inputUser.nextInt();

    // proses
    hasil = panjang * lebar;

    // output / keluaran
    System.out.printf("Luas = %d", hasil);

    inputUser.close();

  }

}