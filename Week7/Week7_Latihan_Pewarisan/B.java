package Week7_Latihan_Pewarisan;

/**
 *
 * @author khoirul
 */
public class B extends A {   //deklarasi class B yang diturunkan

    int z;                  //dari class A

    void TampilkanJumlah() {
        //subclass dapat mengakses member dari superclass
        System.out.println("Jumlah : " + (x + y + z));
    }
}
