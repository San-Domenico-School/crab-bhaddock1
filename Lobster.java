import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int i = 0;
    public void act()
    {
        Greenfoot.setSpeed(60);
        rotateRandomly();
        move(1);
        
        turnAtEdge();
        i++;
        // Add your action code here.
    }
    
    private void rotateRandomly()
    {
        if(i == 144)
        {
            turn((int)(100 * Math.random()));
            i = 0;
        }
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(90);
        }
    }
}
