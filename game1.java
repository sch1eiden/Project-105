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
    
        addObject(timer, 940, 20);

        prepare();
    }

    public void act(){

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Wall wall = new Wall();
        addObject(wall,109,666);
        Wall wall2 = new Wall();
        addObject(wall2,113,509);
        wall2.setLocation(110,508);
        wall2.setLocation(109,506);
        Wall wall3 = new Wall();
        addObject(wall3,112,346);
        wall3.setLocation(110,346);
        Wall wall4 = new Wall();
        addObject(wall4,114,188);
        wall4.setLocation(109,188);
        WallV wallv = new WallV();
        addObject(wallv,207,740);
        wallv.setLocation(199,733);
        WallV wallv2 = new WallV();
        addObject(wallv2,365,738);
        wallv2.setLocation(359,732);
        WallV wallv3 = new WallV();
        addObject(wallv3,526,738);
        wallv3.setLocation(519,733);
        WallV wallv4 = new WallV();
        addObject(wallv4,684,740);
        wallv4.setLocation(679,731);
        WallV wallv5 = new WallV();
        addObject(wallv5,845,737);
        wallv5.setLocation(838,730);
        Wall wall5 = new Wall();
        addObject(wall5,912,640);
        wall5.setLocation(908,640);
        Wall wall6 = new Wall();
        addObject(wall6,910,479);
        wall6.setLocation(909,480);
        Wall wall7 = new Wall();
        addObject(wall7,911,320);
        wall7.setLocation(909,321);
        wall7.setLocation(911,319);
        Wall wall8 = new Wall();
        addObject(wall8,911,159);
        WallV wallv6 = new WallV();
        addObject(wallv6,842,69);
        WallV wallv7 = new WallV();
        addObject(wallv7,682,70);
        WallV wallv8 = new WallV();
        addObject(wallv8,522,72);
        wallv8.setLocation(522,71);
        WallV wallv9 = new WallV();
        addObject(wallv9,362,71);
        WallV wallv10 = new WallV();
        addObject(wallv10,201,72);
        Wall wall9 = new Wall();
        addObject(wall9,110,144);
        Wall wall10 = new Wall();
        addObject(wall10,405,315);
        Wall wall11 = new Wall();
        addObject(wall11,409,480);
        wall11.setLocation(406,475);
        WallV wallv11 = new WallV();
        addObject(wallv11,503,550);
        WallV wallv12 = new WallV();
        addObject(wallv12,669,551);
        wallv11.setLocation(496,543);
        wallv12.setLocation(656,542);
        WallV wallv13 = new WallV();
        addObject(wallv13,503,253);
        wallv13.setLocation(496,246);
        wallv13.setLocation(495,246);
        WallV wallv14 = new WallV();
        addObject(wallv14,663,252);
        wallv14.setLocation(655,246);
        Wall wall12 = new Wall();
        addObject(wall12,754,479);
        wall12.setLocation(746,470);
        Wall wall13 = new Wall();
        addObject(wall13,753,314);
        wall13.setLocation(745,316);
        Car car = new Car();
        addObject(car,191,681);
        Star star = new Star();
        addObject(star,265,168);
        Star star2 = new Star();
        addObject(star2,234,319);
        Star star3 = new Star();
        addObject(star3,232,452);
        Star star4 = new Star();
        addObject(star4,565,172);
        Star star5 = new Star();
        addObject(star5,731,155);
        Star star6 = new Star();
        addObject(star6,797,348);
        Star star7 = new Star();
        addObject(star7,806,474);
        Star star8 = new Star();
        addObject(star8,619,617);
        Star star9 = new Star();
        addObject(star9,254,551);
        Bush bush = new Bush();
        addObject(bush,348,263);
        Bush bush2 = new Bush();
        addObject(bush2,810,234);
        bush2.act();
        bush2.turn(180);
        bush2.act();
        bush2.turn(27);
        removeObject(bush2);
        Bush bush3 = new Bush();
        addObject(bush3,806,234);
        bush3.turn(270);
        bush3.turn(180);
        bush3.setLocation(774,276);
        car.setLocation(185,655);
    }
}
