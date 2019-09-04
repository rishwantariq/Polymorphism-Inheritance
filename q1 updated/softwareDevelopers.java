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
public class softwareDevelopers extends employee {
    
    public softwareDevelopers()
    {
        super();
    }
    public void calculatePay()
    {
        System.out.println("Calculate pay for Software Developer");
    }
    
    public void employeeBenefits(ArrayList<String> employeeBenefit)
    {
        System.out.println("employee is Developer");
        String benefit = employeeBenefit.get(0);
        String benefit2 = employeeBenefit.get(1);
        System.out.println(benefit);
        System.out.println(benefit2);
    }
    
    
    
}
