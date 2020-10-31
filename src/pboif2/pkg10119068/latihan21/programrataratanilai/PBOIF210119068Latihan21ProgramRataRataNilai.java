/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan21.programrataratanilai;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan rata rata nilai
 */
public class PBOIF210119068Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int i, j ;
        float jumlahMhs,k,rataRata;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        j = keyboard.nextInt();
        jumlahMhs = 0 ;
        i = 1 ;
        while (i<=j){
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            k=keyboard.nextFloat();
            jumlahMhs += k ;
            i++;
        }
        rataRata = jumlahMhs / j;
        System.out.println("Maka, Rata-Rata Nilainya Adalah : " + rataRata);
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
