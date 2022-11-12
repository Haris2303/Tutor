package com.belajar;

public class Main {

  public static void main(String[] args) {

    // Nilai Max - Min INTEGER
    int i = 2147483647 + 1;
    System.out.println("Nilai dari int = " + i);
    System.out.println("Nilai MAX dari int = " + Integer.MAX_VALUE);
    System.out.println("Nilai MIN dari int = " + Integer.MIN_VALUE);

    System.out.println("\n=========BYTE===========\n");

    // Byte
    byte a = (byte)130;
    System.out.println("Nilai a = " + a);
    System.out.println("Nilai MAX dari byte = " + Byte.MAX_VALUE);
    System.out.println("Nilai MIN dari byte = " + Byte.MIN_VALUE);

    // long
    System.out.println("\n=========LONG===========\n");

    System.out.println("Nilai MAX dari long = " + Long.MAX_VALUE);
    System.out.println("Nilai MIN dari long = " + Long.MIN_VALUE);

    // short
    System.out.println("\n=========SHORT===========\n");

    System.out.println("Nilai MAX dari Short = " + Short.MAX_VALUE);
    System.out.println("Nilai MIN dari Short = " + Short.MIN_VALUE);

    // float
    System.out.println("\n=========FLOAT===========\n");
    System.out.println("NIlai MAX dari Float = " + Float.MAX_VALUE);
    System.out.println("NIlai MIN dari Float = " + Float.MIN_VALUE);

    // Double
    System.out.println("\n=========DOUBLE===========\n");
    System.out.println("NIlai MAX dari Double = " + Double.MAX_VALUE);
    System.out.println("NIlai MIN dari Double = " + Double.MIN_VALUE);
  }
  
}