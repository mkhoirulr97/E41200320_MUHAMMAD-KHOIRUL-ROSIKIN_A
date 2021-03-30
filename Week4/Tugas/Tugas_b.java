package Tugas;
/**
 *
 * @author khoirul
 */
public class Tugas_b {
    public static void main(String[] args){
        System.out.println("           Do_While          ");
        System.out.println("Bilangan kelipatan 2 (1 -100)");
        System.out.println("=============================");
        int g = 1;
        int i = 0;
        do {
            System.out.print(i+1 + "   ");
            i = i * 2;
            i++;
        }
        while (i <= 100);
        System.out.println(" ");
    }
}
