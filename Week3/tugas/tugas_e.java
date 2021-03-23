package tugas;

import java.util.Scanner;

public class tugas_e {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("                       CAFE MOT                     ");
        System.out.println("                ANEKA MAKANAN & MINUMAN             ");
        System.out.println("----------------------------------------------------");
        System.out.println("                     SPECIAL MENU :                 ");
        System.out.println("1. Ayam Geprek");
        System.out.println("2. Mie Teler");
        System.out.println("3. Nasi Empok");
        System.out.println("4. Boba Milk");
        System.out.println("5. Soda Gembira");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama_pembeli = input.nextLine();
        System.out.print("Silahkan masukkan pilihan anda : ");
        int menu = input.nextInt();
        String pesanan = "";
        
        switch(menu){
            case 1:
                pesanan = "Ayam Geprek";
                break;
            case 2:
                pesanan = "Mie Teler";
                break;
            case 3:
                pesanan = "Nasi Empok";
                break;
            case 4:
                pesanan = "Boba Milk";
                break;
            case 5:
                pesanan = "Soda Gembira";
                break;
        }
        System.out.println("Makanan/Minuman yang anda pesan adalah " + menu + ". " + pesanan);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih saudara/i " + nama_pembeli + " telah berkunjung di CAFE MOT");
    } 
}
