package kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int angka1, angka2;
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka ke-1 =");
        angka1=input.nextInt();
        System.out.print("masukan angka ke-2 =");
        angka2=input.nextInt();

        kalkulator hasil = new kalkulator(angka1,angka2);

        System.out.println(angka1 +"+"+angka2+"="+hasil.plus());
        System.out.println(angka1+"-"+angka2+"="+hasil.minus());
        System.out.println(angka1+"*"+angka2+"="+hasil.multiply());
        System.out.println(angka1+"/"+angka2+"="+hasil.divide());
        System.out.println(angka1+"%"+angka2+"="+hasil.modulus());
    }
}