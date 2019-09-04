/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author rishwantariq
 */
public class Main
{

 public static class Student
 {
    void openRegistrationPage() 
    {
        try{
        long coursesOfferred[] = new long[1000000000];
        }
        
        catch(Exception e){
            System.out.println("cannot do this");
        }
    }
 
 }
 
 public static void main(String[] args)
 {
   
    Student currentStudent= new Student();
     try {
    System.out.println("Registration period is active");
    currentStudent.openRegistrationPage();
    }
    
    catch(OutOfMemoryError e)
    {
        System.out.println("registration page crashed");
    }
    
    finally
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
 }
 
}
