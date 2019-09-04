/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author rishwantariq
 */
public class pet extends animals implements tricks {
    
    public void eat()
    {
        System.out.println("Pet animal is fed");
    }
    
    @Override
    public void chaseBall()
    {
        System.out.println("Pet chases ball");
    }
    
    @Override
    public void playDead()
    {
                System.out.println("Pet plays dead");

    }
    
    private void play() //only pets can play 
    {
                System.out.println("play with pet");

    }
    
    public void playWithIt()
    {
        play();
    }
}
