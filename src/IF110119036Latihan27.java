/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Merubah Ukuran Huruf
 */

import java.util.Scanner;
public class IF110119036Latihan27 {

    /**
     * @param args the command line arguments
     */
  static Scanner scan = new Scanner(System.in);

    private static String masukkanKalimat(){
        System.out.print("Masukkan Kalimat : ");
        return scan.nextLine();
    }

    private static void tampilKalimat(String kalimat){
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(kalimat.toLowerCase()));
    }

    public static void main(String[] args) {
        tampilKalimat(masukkanKalimat());
        System.out.println("Developed by : Alfi Nurizkya");
    }
}
