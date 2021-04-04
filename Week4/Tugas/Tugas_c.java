package Tugas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class Tugas_c {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data nilai = ");
        int k = scan.nextInt();
        int[] array;
        array = new int[k];
        int data;
        double rata_rata = 0;
        
        //input angka array
        for(int i = 0; i < k; i++){
            System.out.print("Masukkan data nilai ke-" + (i+1) + " = ");
            array[i] = scan.nextInt();
        }
        int min = array[0];
        int max = array[0];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if(max < array[i]) {
                max = array[i];
            }
        }
        //rata_rata
        for (int i = 0; i < array.length; i++){
            rata_rata = rata_rata + array[i];
        }
        
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai rata-ratanya adalah = " + rata_rata/array.length);
    }
}
