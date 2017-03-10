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
        super(60);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,56,697);
        Wall wall2 = new Wall();
        addObject(wall2,63,539);
        wall2.setLocation(57,537);
        wall2.setLocation(57,535);
        WallV wallv = new WallV();
        addObject(wallv,132,451);
        WallV wallv2 = new WallV();
        addObject(wallv2,299,459);
        wallv2.setLocation(290,449);
        Wall wall3 = new Wall();
        addObject(wall3,186,694);
        wall3.setLocation(185,694);
        WallV wallv3 = new WallV();
        addObject(wallv3,261,609);
        wallv3.setLocation(255,603);
        WallV wallv4 = new WallV();
        addObject(wallv4,420,610);
        wallv4.setLocation(415,602);
        Wall wall4 = new Wall();
        addObject(wall4,367,363);
        wall4.setLocation(364,356);
        Wall wall5 = new Wall();
        addObject(wall5,513,535);
        wall5.setLocation(505,531);
        Wall wall6 = new Wall();
        addObject(wall6,511,374);
        wall6.setLocation(506,372);
        Bush bush = new Bush();
        addObject(bush,335,487);
        Star star = new Star();
        addObject(star,338,546);
        Star star2 = new Star();
        addObject(star2,136,548);
        WallV wallv5 = new WallV();
        addObject(wallv5,577,288);
        wallv5.setLocation(569,281);
        WallV wallv6 = new WallV();
        addObject(wallv6,734,286);
        wallv6.setLocation(730,281);
        WallV wallv7 = new WallV();
        addObject(wallv7,588,151);
        WallV wallv8 = new WallV();
        addObject(wallv8,754,153);
        wallv8.setLocation(748,152);
        Wall wall7 = new Wall();
        addObject(wall7,367,198);
        wall7.setLocation(364,196);
        wall7.setLocation(363,227);
        WallV wallv9 = new WallV();
        addObject(wallv9,445,156);
        wallv9.setLocation(444,152);
        wallv9.setLocation(445,152);
        Wall wall8 = new Wall();
        addObject(wall8,827,356);
        wall8.setLocation(820,349);
        Wall wall9 = new Wall();
        addObject(wall9,827,516);
        wall9.setLocation(821,511);
        Wall wall10 = new Wall();
        addObject(wall10,991,354);
        Wall wall11 = new Wall();
        addObject(wall11,998,521);
        wall11.setLocation(992,513);
        Wall wall12 = new Wall();
        addObject(wall12,1005,680);
        wall12.setLocation(994,673);
        WallV wallv10 = new WallV();
        addObject(wallv10,908,748);
        wallv10.setLocation(905,743);
        WallV wallv11 = new WallV();
        addObject(wallv11,747,745);
        wallv11.setLocation(752,743);
        Star star3 = new Star();
        addObject(star3,685,209);
        Wall wall13 = new Wall();
        addObject(wall13,997,199);
        wall13.setLocation(992,194);
        WallV wallv12 = new WallV();
        addObject(wallv12,914,157);
        wall13.setLocation(991,226);
        wallv12.setLocation(906,151);
        Car car = new Car();
        addObject(car,121,711);
        car.turn(90);
        car.act();
        car.turn(180);
        car.setLocation(122,698);
        Star star4 = new Star();
        addObject(star4,761,349);
        Wall wall14 = new Wall();
        addObject(wall14,691,515);
        Wall wall15 = new Wall();
        addObject(wall15,695,368);
        wall15.setLocation(691,367);
        Star star5 = new Star();
        addObject(star5,601,349);
        Star star6 = new Star();
        addObject(star6,611,503);
        WallV wallv13 = new WallV();
        addObject(wallv13,603,746);
        wallv13.setLocation(592,743);
        WallV wallv14 = new WallV();
        addObject(wallv14,438,747);
        Wall wall16 = new Wall();
        addObject(wall16,507,676);
    }
}
