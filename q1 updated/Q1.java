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


public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <String> employeeBenefit= new ArrayList(); //create arrayList for benefits 
        employeeBenefit.add("basic benefits");
        employeeBenefit.add("Dev benefits");
        employeeBenefit.add("Manager benefits");
        
        //create array to store all employees
        employee employeeList[] = new employee[4];
        //hardcode employees to check all methods
        
        employeeList[0] = new intern();
        employeeList[1]= new projectManager();
        employeeList[2]= new intern();
        employeeList[3] = new softwareDevelopers();
        
        
        //get benefits method to check all employees have proper benefits
        
        for(int i=0; i<4; i++)
        {
            employeeList[i].employeeBenefits(employeeBenefit);
            employeeList[i].calculatePay();
            System.out.println("");
        }
    }
    
}
