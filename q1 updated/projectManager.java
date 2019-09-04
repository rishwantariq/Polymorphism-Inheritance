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
public class projectManager extends employee {
     
    public projectManager()
    {
        super();
    }
    
    public void calculatePay()
    {
        System.out.println("Calculate pay for Project Manager");
    }
    
    public void employeeBenefits(ArrayList<String> employeeBenefit)
    {
        System.out.println("employee is Manager");
        String benefit = employeeBenefit.get(2);
        System.out.println(benefit);
    }
    
   
    
}
