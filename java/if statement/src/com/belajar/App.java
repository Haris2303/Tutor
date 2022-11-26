package com.belajar;

public class App {

  public static void main(String[] args) {
    
    // if statement
    // => sebuah perkondisian yang dimana if hanya mengandung nilai true or false

    // String satu = "satu";

    // if(satu == "satu") {
    //   System.out.println("ini Bisa!!");
    // }

    // String nama1 = "Gery";
    // String nama2 = "Gery";

    // if (nama1 == nama2) {
    //   System.out.println("Ini Bisa");
    // }

    /* 
     * jika nilai yang didapatkan > 90 maka tampilkan nilai A
     * jika nilai yan didapatkan > 80 maka tampilkan nilai B
     * jika nilai yang didapatkan > 70 maka tampilkan nilai C
     * selain itu tampilkan nilai D
     */
    
    //  char char1 = 'A';

    //  if(char1 == 'A') {
    //   System.out.println("Char ini sama dengan A");
    //  }
    
    int nilai = 160;

    if ( nilai < 50 ) {
      System.out.println("Nilai " + nilai + " terlalu kecil");
    } else if ( nilai > 50 && nilai < 100 ) {
      System.out.println("Nilai " + nilai + " terlalu besar");
    } else {
      System.out.println("Nilai Kocak");
    }

  }

}