/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author rishwantariq
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        payFee obj = new A(); //pays with scholarship
        payFee obj2 = new B(); //pays full
        
       float fee= obj.calculateFee();
       float fee2=obj2.calculateFee();
       
       System.out.println(fee);
       System.out.println(fee2);

        
    }
    
}
