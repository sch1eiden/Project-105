import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class item extends Actor
{
    //int check = 0;
    /**
     * Act - do whatever the item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void del(){
        if(Greenfoot.isKeyDown("z")){
         getWorld().removeObject(this);
         //check++;
         /*if(TimedWorld.check>=1800){
            getWorld().addObject(new item(),48,45);
            TimedWorld.check = 0;
            }*/
        }
    
    }
    
    public void act() 
    {
         del();
    }    
}
