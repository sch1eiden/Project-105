import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game1 extends TimedWorld
{
    
    /**
     * Constructor for objects of class game1.
     * 
     */
    public game1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(30);
        addObject(new Wall(), 78,690);
        addObject(new Wall(), 78,590);
        addObject(new Wall(), 78,490);
        addObject(new Wall(), 78,390);
        addObject(new Wall(), 78,290);
        addObject(new Wall(), 78,190);
        addObject(new Wall(), 78,90);
        addObject(new WallV(), 168,21);
        addObject(new WallV(), 328,21);
        addObject(new WallV(), 488,21);
        addObject(new WallV(), 648,21);
        addObject(new WallV(), 808,21);
        addObject(new WallV(), 877,21);
        addObject(new Wall(), 968,90);
        addObject(new Wall(), 968,251);
        addObject(new Wall(), 968,411);
        addObject(new Wall(), 968,511);
        addObject(new Wall(), 968,671);
        addObject(new Wall(), 968,681);
        addObject(new Wall(), 406,279);
        addObject(new Wall(), 406,438);
        addObject(new WallV(), 495,506);
        addObject(new WallV(), 654,506);
        addObject(new WallV(), 496,209);
        addObject(new WallV(), 655,208);
        addObject(new Wall(), 745,277);
        addObject(new Wall(), 745,437);
        addObject(new Star(), 175,415);
        addObject(new Star(), 304,255);
        addObject(new Star(), 852,412);
        addObject(new Star(), 534,674);
        addObject(new Bush(), 805,200);
        addObject(new Bush(), 254,632);
        addObject(new Car(), 573,108);
        addObject(timer, 940, 20);
        
  
        
        
    }
    
    public void act(){
        
    }
}
