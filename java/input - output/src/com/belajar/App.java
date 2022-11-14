package com.belajar;

import java.util.Scanner;

public class App {
  
  public static void main(String[] args) {

    // input pada java
    Scanner inputUser = new Scanner(System.in);

    // deklarasi variabel
    int angka;

    // input
    System.out.print("Masukkan angka: ");
    angka = inputUser.nextInt();

    // output
    System.out.println("Angka yang anda masukkan adalah " + angka);

    inputUser.close();

  }

}
