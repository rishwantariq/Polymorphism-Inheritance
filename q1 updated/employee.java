/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.ArrayList;

/**
 *
 * @author rishwantariq
 */
abstract public class employee { //abstract class that extends

    public employee()
    {
      super();
    }
    abstract public void employeeBenefits(ArrayList<String> A); //prints benefits for employees based on position of that employee
    abstract public void calculatePay(); //abstract method 
   
}
