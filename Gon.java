import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gon extends Actor
{
    /**
     * Act - do whatever the Gon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){
         Greenfoot.playSound("click_one.wav");
        Greenfoot.setWorld(new Level());
    }
    }    
}
