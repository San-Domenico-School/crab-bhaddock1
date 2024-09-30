import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author BGustin
 * @version 6/1/2022 5:48am
 */
public class Crab extends Actor
{
    // Always place fields first in the class.
    
    // After the fields place the behaviors
    public void act()
    {
        movement();
        edgeMovement();
        collision();
    }
    
   private void movement()
   {
        if(Greenfoot.isKeyDown("down"))
        {
            move(-1);
        }
    
        if(Greenfoot.isKeyDown("up"))
        {
            move(1);
        } 
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(1);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-1);
        }
   }
   
   private void edgeMovement()
   {
        if(getX() >= 545 && Greenfoot.isKeyDown("right"))
        {
            setLocation(0, getY());
        }
        
        if(getX() <= 15 && Greenfoot.isKeyDown("left"))
        {
            setLocation(560, getY());
        }
   }
   
   private void collision()
   {
       if(isTouching(Lobster.class))
       {
           Greenfoot.stop();
       }
   }

}


