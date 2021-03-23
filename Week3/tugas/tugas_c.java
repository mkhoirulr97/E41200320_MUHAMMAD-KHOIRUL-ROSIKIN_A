package tugas;

public class tugas_c {
    public static void main(String[] args){
        //deklarasi Array
        int [][] angka = {
            {5,6,1,7}, 
            {8,1,2,9}, 
            {5,4,7,1},
            {8,3,7,5}
        };
        
        //print angka matriks
        for (int baris = 0; baris < 4; baris++){
            System.out.print("[ ");
            for (int kolom = 0; kolom < 4; kolom++){
                System.out.print(angka[baris][kolom] + " ");
            }
            System.out.println("]");
        }
    }
}
