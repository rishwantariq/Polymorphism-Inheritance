/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author rishwantariq
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        B obj = new B();
        obj.method();
        
        A obj2= new A();
        
        obj2.methodInA(); //doThat only accesible to A (private)
        
    }
    
}
