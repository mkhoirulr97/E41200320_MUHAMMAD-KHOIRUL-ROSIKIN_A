/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author khoirul
 */
public class person {
    String fName;
    String stuID;
    String stuStatus;
    
    public void set(String Name, String stuid, String stustatus){
        fName = Name;
        stuID = stuid;
        stuStatus = stustatus;
    }
    public void show(){
        System.out.println("Biodata");
        System.out.println("Nama : " + fName);
        System.out.println("student ID : " + stuID);
        System.out.println("student Status : " + stuStatus);
    }
}
class biodata{
    public static void main(String[]args){
        //constructor
        person orang = new person();
        orang.set("Muhammad Khoirul Rosikin", "987654321", "Active");
        orang.show();
    }    
}
