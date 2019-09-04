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
public class intern extends employee {

    /**
     *
     */
    public intern()
    {
     super();
    }
    public void calculatePay()
    {
        System.out.println("Calculate pay for intern");
        
    }
    
    
    public void employeeBenefits(ArrayList <String> employeeBenefit)
    {
        System.out.println("employee is intern");
       String benefit = employeeBenefit.get(0);
        System.out.println(benefit);
    }
    
    
    
}
