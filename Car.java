import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            move(2);
            if(Greenfoot.isKeyDown("left")){
                turn(-2);
            }
            if(Greenfoot.isKeyDown("right")){   
                turn(2);
            }
        }
        if(Greenfoot.isKeyDown("down")){
            move(-2);
            if(Greenfoot.isKeyDown("left")){
                turn(-2);
            }
            if(Greenfoot.isKeyDown("right")){
                turn(2);
            }
        }
        if(isTouching(Star.class)){
            List<Star> stars = this.getIntersectingObjects(Star.class);
            for(Star star : stars) {
                getWorld().removeObject(star);
                ((TimedWorld)getWorld()).addScore();
            }
        }
        
        if(isTouching(IWall.class)) {
            Greenfoot.stop();
            // game over
        }
    }
}
