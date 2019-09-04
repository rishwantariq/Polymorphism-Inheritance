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

public class A 
{

    public A()
    {
        super();
    }
   public void doThis()
    {
        System.out.println("doThis called");
    }
 
   private void doThat()
    {
         System.out.println("doThat called by A");

    }
   
  void methodInA() //private method only accesible by A to invoke do that
   {
      doThat();
   }
    
}
