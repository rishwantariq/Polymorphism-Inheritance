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
public class A extends payFee{
    public float calculateFee()
    {
        float fee;
        fee=numberOfCourses * courseFee;
        float deduction =((fee/100)* 50);
        fee=fee - deduction;
        return fee;
    }
}
