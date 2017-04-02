import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game3 extends TimedWorld
{

    /**
     * Constructor for objects of class game3.
     * 
     */
    public game3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(120);

        prepare();
        addObject(new item(),48,45);
    }
    
    public void act(){
        if(getObjects(Star.class).isEmpty()){
            addObject(new ScoreBoardWin(getScore()),getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Reset3 reset3 = new Reset3();
        addObject(reset3,712,23);
        Home home = new Home();
        addObject(home,655,27);
        home.setLocation(650,23);
        Wall wall = new Wall();
        addObject(wall,122,628);
        Wall wall2 = new Wall();
        addObject(wall2,237,630);
        Wall wall3 = new Wall();
        addObject(wall3,124,469);
        wall3.setLocation(122,468);
        Wall wall4 = new Wall();
        addObject(wall4,241,467);
        wall4.setLocation(238,469);
        WallV wallv = new WallV();
        addObject(wallv,316,389);
        wallv.setLocation(308,379);
        WallV wallv2 = new WallV();
        addObject(wallv2,313,276);
        wallv2.setLocation(311,276);
        WallV wallv3 = new WallV();
        addObject(wallv3,199,281);
        wallv3.setLocation(187,276);
        Wall wall5 = new Wall();
        addObject(wall5,125,352);
        wall5.setLocation(116,346);
        wall5.setLocation(120,345);
        wallv3.setLocation(190,276);
        wall4.setLocation(238,514);
        wallv.setLocation(310,418);
        wallv.setLocation(320,386);
        wall4.setLocation(250,477);
        wall2.setLocation(252,637);
        wallv3.setLocation(202,166);
        wallv2.setLocation(362,165);
        Wall wall6 = new Wall();
        addObject(wall6,125,242);
        wall6.setLocation(123,235);
        wallv.setLocation(340,295);
        wall4.setLocation(268,385);
        wall2.setLocation(269,545);
        wall2.setLocation(261,639);
        Wall wall7 = new Wall();
        addObject(wall7,276,552);
        wall7.setLocation(270,544);
        wall2.setLocation(271,636);
        Wall wall8 = new Wall();
        addObject(wall8,437,376);
        wall8.setLocation(430,368);
        Wall wall9 = new Wall();
        addObject(wall9,542,369);
        WallV wallv4 = new WallV();
        addObject(wallv4,531,172);
        wallv4.setLocation(522,164);
        WallV wallv5 = new WallV();
        addObject(wallv5,689,168);
        wallv5.setLocation(682,163);
        Wall wall10 = new Wall();
        addObject(wall10,550,530);
        wall10.setLocation(544,528);
        Wall wall11 = new Wall();
        addObject(wall11,437,536);
        wall11.setLocation(430,529);
        Wall wall12 = new Wall();
        addObject(wall12,879,261);
        wall12.setLocation(874,257);
        WallV wallv6 = new WallV();
        addObject(wallv6,805,166);
        wallv6.setLocation(806,163);
        wall12.setLocation(874,253);
        Wall wall13 = new Wall();
        addObject(wall13,875,415);
        wall13.setLocation(875,411);
        Wall wall14 = new Wall();
        addObject(wall14,883,576);
        wall14.setLocation(876,571);
        wall2.setLocation(271,626);
        WallV wallv7 = new WallV();
        addObject(wallv7,209,723);
        wallv7.setLocation(201,716);
        WallV wallv8 = new WallV();
        addObject(wallv8,152,723);
        wallv8.setLocation(190,716);
        WallV wallv9 = new WallV();
        addObject(wallv9,369,722);
        wallv9.setLocation(361,714);
        WallV wallv10 = new WallV();
        addObject(wallv10,525,716);
        wallv10.setLocation(522,713);
        WallV wallv11 = new WallV();
        addObject(wallv11,683,716);
        wallv11.setLocation(683,712);
        WallV wallv12 = new WallV();
        addObject(wallv12,814,719);
        wallv12.setLocation(812,713);
        Wall wall15 = new Wall();
        addObject(wall15,881,645);
        wall15.setLocation(877,645);
        Wall wall16 = new Wall();
        addObject(wall16,709,369);
        wall16.setLocation(709,364);
        Wall wall17 = new Wall();
        addObject(wall17,717,531);
        wall17.setLocation(709,524);
        WallV wallv13 = new WallV();
        addObject(wallv13,793,281);
        wallv13.setLocation(786,273);
        wall16.setLocation(715,363);
        wall17.setLocation(715,522);
        wall9.setLocation(553,366);
        wall10.setLocation(553,526);
        Car car = new Car();
        addObject(car,202,678);
        car.setLocation(199,678);
        car.turn(270);
        car.setLocation(196,631);
        car.setLocation(191,625);
        Star star = new Star();
        addObject(star,195,497);
        Star star2 = new Star();
        addObject(star2,195,321);
        Star star3 = new Star();
        addObject(star3,334,225);
        Star star4 = new Star();
        addObject(star4,505,227);
        star3.setLocation(318,221);
        star4.setLocation(493,226);
        Star star5 = new Star();
        addObject(star5,489,421);
        Bush bush = new Bush();
        addObject(bush,616,599);
        Bush bush2 = new Bush();
        addObject(bush2,660,603);
        bush2.setLocation(662,600);
        bush.setLocation(604,596);
        bush2.setLocation(663,595);
        Star star6 = new Star();
        addObject(star6,811,226);
        Star star7 = new Star();
        addObject(star7,632,514);
        Star star8 = new Star();
        addObject(star8,623,378);
        Star star9 = new Star();
        addObject(star9,351,415);
        Star star10 = new Star();
        addObject(star10,345,592);
        Star star11 = new Star();
        addObject(star11,499,659);
        Star star12 = new Star();
        addObject(star12,774,664);
        Star star13 = new Star();
        addObject(star13,798,374);
        Star star14 = new Star();
        addObject(star14,796,533);
    }
}
