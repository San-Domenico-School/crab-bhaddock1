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
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        } 
        if(Greenfoot.isKeyDown("up"))
        {
            turn(1);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(-1);
        }
    }
   
}


