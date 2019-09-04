/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author rishwantariq
 */

import java.util.Random;

public class A implements C 
{
    public boolean continuePlaying()
    {
        System.out.println("continue playing game");
        return true;
    }
    
    public boolean exitGame()
    {
        System.out.println("exit the game");
        return true;   
    }
    
    public boolean stopWastingTime()
    {
        Random rand = new Random();
        int check = rand.nextInt(2);
        
        if(check==0)
        {
            boolean flag = exitGame();
            return false;
        }
        else 
        {
            boolean flag = continuePlaying();
            return true;
        }
        
    }
}
