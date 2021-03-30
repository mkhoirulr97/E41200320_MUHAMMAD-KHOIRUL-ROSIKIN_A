package Tugas;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class Tugas_a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan batas awal bilangan = ");
        int batas_awal = scan.nextInt();
        System.out.print("Masukkan batas akhir bilangan = ");
        int batas_akhir =scan.nextInt();
        System.out.println("Berikut adalah bilangan genap sesuai range yang diinginkan : ");
        System.out.print("[");
        for (int bilangan_genap = 1; bilangan_genap <= batas_akhir; bilangan_genap++){
            if(bilangan_genap % 2 == 0){
                System.out.print(bilangan_genap + " ");
            }
            else{
            }
        }
        System.out.print("]");
    }
}
