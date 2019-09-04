/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author rishwantariq
 */
import java.io.*; 

public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        animals petAnimal = new pet(); //pet
        animals wildAnimal = new wild(); //wild
        
        petAnimal.eat();
        petAnimal.sleep();
        petAnimal.walk();
        
        pet A = new pet();
        A.playWithIt(); //calls private function play only available to pet class
        A.playDead(); //interface
        A.chaseBall();
       
        System.out.println("");
        wildAnimal.eat();
        wildAnimal.sleep();
        wildAnimal.walk();
        
    }
    
}
