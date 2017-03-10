import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game2 extends TimedWorld
{

    /**
     * Constructor for objects of class game2.
     * 
     */
    public game2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(45);
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
        addObject(new Wall(), 180,697);
        addObject(new WallV(), 249,606);
        
        addObject(new WallV(), 409,604);
        addObject(new WallV(), 568,602);
        addObject(new WallV(), 411,496);
        addObject(new WallV(), 570,496);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,380,254);
        Wall wall2 = new Wall();
        addObject(wall2,712,252);
        removeObject(wall2);
        removeObject(wall);
        Wall wall3 = new Wall();
        addObject(wall3,657,402);
        wall3.setLocation(643,406);
        Wall wall4 = new Wall();
        addObject(wall4,648,699);
        wall4.setLocation(644,694);
        Car car = new Car();
        addObject(car,476,265);
        car.setLocation(160,556);
        car.act();
        car.turn(90);
        car.turn(180);
        car.setLocation(126,691);
        Star star = new Star();
        addObject(star,873,257);
        Star star2 = new Star();
        addObject(star2,332,175);
        Star star3 = new Star();
        addObject(star3,142,402);
        WallV wallv = new WallV();
        addObject(wallv,884,195);
        wallv.setLocation(878,191);
        WallV wallv2 = new WallV();
        addObject(wallv2,733,198);
        wallv2.setLocation(730,191);
        Bush bush = new Bush();
        addObject(bush,656,232);
        Bush bush2 = new Bush();
        addObject(bush2,716,605);
        Star star4 = new Star();
        addObject(star4,838,677);
        Wall wall5 = new Wall();
        addObject(wall5,665,103);
        wall5.setLocation(663,104);
        WallV wallv3 = new WallV();
        addObject(wallv3,575,194);
        wallv3.setLocation(574,192);
        WallV wallv4 = new WallV();
        addObject(wallv4,558,340);
        Wall wall6 = new Wall();
        addObject(wall6,474,409);
        Wall wall7 = new Wall();
        addObject(wall7,313,411);
        Bush bush3 = new Bush();
        addObject(bush3,401,344);
        wall7.setLocation(321,422);
    }
}
