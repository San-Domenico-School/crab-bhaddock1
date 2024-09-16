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
        addObject(crab, 470, 100);
        Fruit fruit = new Fruit();
        addObject(fruit, 100, 100);
        
        Fruit fruit2 = new Fruit();
        addObject(fruit2, 300, 100);
        
        Fruit fruit3 = new Fruit("bannana");
        Fruit fruit4 = new Fruit("strawberry");
        addObject(fruit3, 200, 100);
        addObject(fruit4, 200, 200);
        
        Fruit fruit5 = new Fruit("cherry", 3, 5, 0);
        addObject(fruit5, 100, 500);
        
        Fruit fruit6 = new Fruit("pick", 7, 10, 20);
        addObject(fruit6, 370, 500);
    }
}