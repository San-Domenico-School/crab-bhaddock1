import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
        
    }
    
    private void prepareScene()
    {
        // instantiate new objects
        Crab crab = new Crab ( );
        // add them to the world
        addObject(crab, 100, 100);
        
        addPlayer();
        
        
        addFood();
        
        
        
        
    }
    private void addPlayer()
    {
        
    }
    private void addFood()
    {
        
    }

}