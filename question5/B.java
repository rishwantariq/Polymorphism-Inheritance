/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author rishwantariq
 */
public class B 
{
  public void isProcessRunning(C obj)
  {
      try
      {
        TimeUnit.SECONDS.sleep(60);

      }
      
      catch(Exception E)
      {
          System.out.println("error in timer");
      }
      
      if(obj.stopWastingTime())
      {
          obj.continuePlaying();
      }
      
      else
      {
          obj.exitGame();
      }
      
  }
    
}
