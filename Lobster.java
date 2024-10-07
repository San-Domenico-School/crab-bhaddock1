import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Defines the Lobster. Lobsters are enemies
 * 
 * @author BHaddock 
 * @version 1.0 10/6/2024
 */
public class Lobster extends Actor
{
    //initializes i to 0
    int i = 0;
    /**
     * Act - sets move, adds to i and calls rotate and turn methods. 
     * called when the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //calls rotate and turn methods
        rotateRandomly();
        turnAtEdge();
        
        move(1);//sets movespeed to 1
        
        i++;//adds to i
    }
    
    /**
     * RotateRandomly - method used to rotate lobster
     * called in the act method
     */
    private void rotateRandomly()
    {
        //turns lobster in random direction at set time interval
        if(i == 144)
        {
            turn((int)(100 * Math.random()));
            
            i = 0;//resets i to 0
        }
    }
    
    /**
     * TurnAtEdge - turns lobster when at edge
     * called in the act method
     */
    private void turnAtEdge()
    {
        //turns lobster 180 degrees when at edge
        if(isAtEdge())
        {
            turn(180);//turns lobster 180 degrees
        }
    }
}
