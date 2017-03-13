import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instruc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class instruc extends World
{

    /**
     * Constructor for objects of class instruc.
     * 
     */
  
    public instruc()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 760, 1);
        showText("CAR MANIA",getWidth()/2,getHeight()/2);
        showText("Instruction: You have to collect the star and avoid touching the grass and bush",getWidth()/2,(getHeight()/2)+20);
        showText("GOOD LUCK!!!!!!",getWidth()/2,(getHeight()/2)+60);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Gon gon = new Gon();
        addObject(gon,574,618);
    }
}
