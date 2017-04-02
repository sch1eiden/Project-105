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
    boolean end = false;
    boolean check = false;
    int skill = 7200;
    int repic = 0;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(end)
            return;
            
        TimedWorld world = (TimedWorld)getWorld();
        
        if(world.timer.secondsLeft <= 0) {
            end = true;
            world.addObject(new ScoreBoard(world.counter.getValue()), world.getWidth()/2, world.getHeight()/2);
        }
        
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
               world.removeObject(star);
               Greenfoot.playSound("wink.wav");
               world.addScore();
            }
        }
        
        if(isTouching(IWall.class) || isTouching(Bush.class)) {
            Greenfoot.playSound("Bomb.mp3");
            end = true;
            world.addObject(new ScoreBoard(world.counter.getValue()), world.getWidth()/2, world.getHeight()/2);
        }
        useitem();
        
        repic++;
        if(repic>=300){
            setImage("car1.png");
            repic = 0;
        }
        
    }
    public void useitem(){
        skill++;
        if(skill>=7200){
            if(Greenfoot.isKeyDown("z")){
                setImage("car mini.png");
                skill=0;
            }  
        } 
        
    }
}
