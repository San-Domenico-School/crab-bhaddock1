import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines the worm. Worms can be eaten by the player
 * 
 * @author BHaddock 
 * @version 1.0 10/6/2024
 */
public class Worm extends Actor
{
    /**
     * Act - calls the remove method.
     * called when the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeIfTouching();
    }
    
    /**
     * RemoveIfTouching - removes the worm and plays eaten noise when touching crab.
     * called in the act method.
     */
    private void removeIfTouching()
    {
        if(isTouching(Crab.class))
        {
            Greenfoot.playSound("eat.wav");//plays eaten noise
            
            getWorld().removeObject(this);//removes the worm touched
        }
    }
}
