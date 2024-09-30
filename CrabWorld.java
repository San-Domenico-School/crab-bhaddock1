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
        addObject(crab,(int)(getWidth() * Math.random()), (int) (getHeight() * Math.random()));
        
        Lobster lobster = new Lobster ( );
        int x = (int) (getWidth() * Math.random());
        int y = (int) (getHeight() * Math.random());
        addObject(lobster, x, y);
        
        x = 0;
        while (x<=10)
        {
            addObject(new Worm(),(int)(getWidth() * Math.random()),(int)(getHeight() * Math.random()));
            x++;
        }
        
        
    }
}