import greenfoot.*;

/**
 * This class defines a crab.The crab is the player.
 * 
 * @author BHaddock
 * @version 1.0 10/6/2024 
 */
public class Crab extends Actor
{
    
   int speed = 1;//sets speed to 1
   int wormsTouched = 0;//sets wormsTouching to 0
   /**
    * Act - calls movement, collision and speedChange methods.
    * called when the 'Act' or 'Run' button gets pressed in the environment.
    */
   public void act()
   {
        movement();
        collision();
        speedChange();
   }
   
   /**
    * SpeedChange - doubles speed when half of the worms remain.
    * called in the act method.
    */
   private void speedChange()
   {
        //if touching adds to wormsTouching and doubles speed if half have been touched
        if(isTouching(Worm.class))
        {
            wormsTouched++;
            
            if(wormsTouched == 5)
            {
                speed++;
            }
        }
   }
   
   /**
    * Movement - moves crab a direction or turns crab with a key press.
    * called in the act method.
    */
   private void movement()
   {
        //moves crab left if down key pressed
        if(Greenfoot.isKeyDown("down"))
        {
            move(-speed);
        }
        //moves crab right if up key pressed
        if(Greenfoot.isKeyDown("up"))
        {
            move(speed);
        } 
        //turns crab clockwise if right key pressed
        if(Greenfoot.isKeyDown("right"))
        {
            turn(1);
        }
        //turns crab counterclockwise if left key pressed
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-1);
        }
   }
   
   /**
    * Collision - ends the game if the crab touches the lobster.
    * called in the act method.
    */
   private void collision()
   {
        //ends game, plays death sound, and removes crab on collision with lobster
        if(isTouching(Lobster.class))
        {
           Greenfoot.playSound("death.wav");//plays death noise
           
           getWorld().removeObject(this);//removes crab from scene
           Greenfoot.stop();//ends game
        }
   }
}


