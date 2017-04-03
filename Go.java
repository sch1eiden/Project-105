import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Go here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Go extends Actor
{
    /**
     * Act - do whatever the Go wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if(Greenfoot.mouseClicked(this)){
         Greenfoot.playSound("click_one.wav");
          MyWorld.name=JOptionPane.showInputDialog("Name : ");
        Greenfoot.setWorld(new instruc());
    }
}
}
