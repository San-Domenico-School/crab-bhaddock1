import greenfoot.*; // (Actor, World, Greenfoot, GreenfootImage)

/**
* Creates the crab world(the beach) and spawns player, enemies and worms.
* also spawns extra enemies.
* 
* @author BHaddock
* @version 1.0 10/6/2024
*/
public class CrabWorld extends World
{
    //initializes i to 0
    int i = 0;
    /**
     * CrabWorld - initializes world size and calls prepare scene method.
     * always active.
     */
    public CrabWorld() 
    {
        super(800, 800, 1);
        prepareScene();
    }
    
    /**
     * Act - method that calls detect and spawner methods and adds to i.
     * called when the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       //calls Spawner and detectWorms methods
       detectWorms(); 
       lobsterSpawner();
       
       i++;//adds to i 
    }
    
    /**
     * PrepareScene - spawns player, enemies, and worms into the scene.
     * called by CrabWorld.
     */
    private void prepareScene()
    {
        // instantiate new crab
        Crab crab = new Crab ( );
        // add crab to the world
        addObject(crab,(int)(getWidth() * Math.random()), (int) (getHeight() * Math.random()));
        //instantiate new lobster 
        Lobster lobster = new Lobster ( );
        //sets random cordinates and adds lobster to the world
        int x = (int) (getWidth() * Math.random());
        int y = (int) (getHeight() * Math.random());
        addObject(lobster, x, y);
        //spawns 10 worms at different random cordinates
        x = 0;
        while (x<=10)
        {
            addObject(new Worm(),(int)(getWidth() * Math.random()),(int)(getHeight() * Math.random()));
            x++;
        }
    }
    
    /**
     * LobsterSpawner - spawns a new lobster after a certain time interval and resets the interval.
     * called in the act method.
     */
    private void lobsterSpawner()
    {
        //spawns new lobster on a time interval i
        if(i == 1100)
        {
            //spawns a new lobster at random cordinates
            Lobster lobster = new Lobster ( );
            int x = (int) (getWidth() * Math.random());
            int y = (int) (getHeight() * Math.random());
            addObject(lobster, x, y);
            
            Greenfoot.playSound("lob.wav");//plays spawn sound
            
            i = 0;//resets i to 0
        }
    }
    
    /**
     * DetectWorms - if no worms are present the game will end.
     * called in the act method.
     */
    private void detectWorms()
    {
        //detects if no worms present and ends game
        if(getObjects(Worm.class).size() <= 0)
        {
            Greenfoot.playSound("fanfare.wav");//plays victory sound
            
            Greenfoot.stop();//stops game
        }
    }
}