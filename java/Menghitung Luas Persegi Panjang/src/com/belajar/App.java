package com.belajar;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    // Menghitung luas persegi panjang

    // buat scanner input
    Scanner input = new Scanner(System.in);

    // deklarasi variable
    int panjang, lebar, hasil;

    // input
    System.out.print("Masukkan panjang: ");
    panjang = input.nextInt();

    System.out.print("Masukkan lebar: ");
    lebar = input.nextInt();

    // proses
    hasil = panjang * lebar;

    // output
    System.out.println("Hasil = " + hasil);

    input.close();

  }

}