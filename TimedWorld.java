import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimedWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimedWorld extends World
{
    public Timer timer;
    public Counter counter = new Counter("Score : ");
    public static int check =0;
    /**
     * Constructor for objects of class TimedWorld.
     * 
     */
    public TimedWorld(int time)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024 , 768, 1);
        timer = new Timer("Time Left: ", time);
        addObject(timer, 940, 20);
        addObject(counter, 800, 20);
    }
    
    public void addScore() {
        counter.add(1);
    }
    
    public int getScore(){
     return counter.getValue();
    }
    public void act(){
        check++;
    }
}
