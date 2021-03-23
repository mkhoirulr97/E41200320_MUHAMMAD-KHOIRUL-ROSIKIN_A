package tugas;

import java.util.Scanner;

public class tugas_b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Berikut adalah deretan nomor random yang diinputkan :");
        int p = input.nextInt();
        int[] angka;
        angka = new int[p];
        
        //input angka
        for(int i = 0; i < p; i++){
            System.out.print("Index ke-" + i + " = ");
            angka[i] = input.nextInt();
        }
        
        //print angka
        System.out.println("Jumlah angka adalah " + p);
        System.out.print("Nilai yang diinputkan adalah " + "( ");
        for(int nilai : angka){
            System.out.print(nilai + " ");
        }
        System.out.print(")");
    }
}
