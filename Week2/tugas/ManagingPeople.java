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
public class managingpeople {
    public static void main(String[] args){
        person p1 = new person("Khoirul", 18);
        person p2 = new person("Nabiyla", 18);
        
        if(p1.getAge() == p2.getAge()){
            System.out.println(p1.getName()+" is the same age as" + p2.getName());
        }
        else{
            System.out.println(p1.getName()+" is NOT the same age as" + p2.getName());
        }
    }  
}
