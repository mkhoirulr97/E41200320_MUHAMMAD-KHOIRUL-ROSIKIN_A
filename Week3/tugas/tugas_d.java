package tugas;

import java.util.Scanner;

public class tugas_d {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("                    WAWA CELLULAR                    ");
        System.out.println("               Promo Belanja Berhadiah               ");
        System.out.println("          Khusus Pembelian 5 Barang Pertama          ");
        System.out.println("          Dengan harga minimum Rp. 10000,00          ");
        System.out.println("-----------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama = input.nextLine();
        
        int[] barang = new int[5];
        int total = 0;
        for (int i = 0; i < barang.length; i++){
            System.out.print("Masukkan harga barang ke-" + (i + 1) + "      : ");
            barang [i] = input.nextInt();
            total = total + barang[i];
        }
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        
        boolean hadiah = false;
        for (int i = 0; i < barang.length; i++){
            hadiah = barang[i] >= 10000;
        }
        System.out.println(" ");
        if (hadiah == true){
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }
        else{
            System.out.println("Mohon maaf anda tidak mendapat hadiah");
        }
        System.out.println(" ");
        System.out.println("-----------------------------------------------------");
        System.out.println("                     Terimakasih                     ");
        System.out.println("       Anda sudah berbelanja di WAWA CELLULAR        ");
    }  
}
