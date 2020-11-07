package com.minr;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Membuat Kalukulator sederhana Latihan 34
 *
 */
public class Main extends Kalkulator{
    public static void main(String[] args) {

        Main user = new Main();
        Scanner userInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        // Input Value
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        user.value1 = userInput.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        user.value2 = userInput.nextDouble();

        // Output Kalkulator
        System.out.println("\nHasil Pertambahan : " + user.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + user.kurangBilangan());
        System.out.println("Hasil Perkalian : " + user.kaliBilangan());
        System.out.println("Hasil Pembagian : " + df.format(user.bagiBilangan()));
        System.out.println("Hasil Sisa : " + user.sisaBilangan());

    }
}
