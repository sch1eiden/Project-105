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
        prepare();
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
        addObject(wall10,637,429);
        Wall wall11 = new Wall();
        addObject(wall11,807,429);
        wall11.setLocation(812,435);
        wall11.setLocation(802,424);
        Wall wall12 = new Wall();
        addObject(wall12,809,267);
        wall12.setLocation(802,262);
        Car car = new Car();
        addObject(car,220,561);
        car.setLocation(201,659);
        wall10.setLocation(639,512);
        wall11.setLocation(801,514);
        wall12.setLocation(803,355);
        WallV wallv11 = new WallV();
        addObject(wallv11,583,281);
        Wall wall13 = new Wall();
        addObject(wall13,645,481);
        wall13.setLocation(640,481);
        Bush bush = new Bush();
        addObject(bush,735,280);
        wallv11.setLocation(600,279);
        WallV wallv12 = new WallV();
        addObject(wallv12,552,410);
        WallV wallv13 = new WallV();
        addObject(wallv13,390,413);
        wallv13.setLocation(392,409);
        WallV wallv14 = new WallV();
        addObject(wallv14,444,283);
        wallv14.setLocation(439,279);
        wallv13.setLocation(432,410);
        Wall wall14 = new Wall();
        addObject(wall14,366,507);
        wall14.setLocation(363,502);
        wall14.setLocation(362,480);
        Wall wall15 = new Wall();
        addObject(wall15,231,489);
        Star star = new Star();
        addObject(star,730,545);
        Star star2 = new Star();
        addObject(star2,723,364);
        Star star3 = new Star();
        addObject(star3,537,356);
        Star star4 = new Star();
        addObject(star4,319,355);
        Star star5 = new Star();
        addObject(star5,291,501);
        Star star6 = new Star();
        addObject(star6,164,483);
        Wall wall16 = new Wall();
        addObject(wall16,231,329);
        WallV wallv15 = new WallV();
        addObject(wallv15,444,173);
        wallv15.setLocation(437,166);
        WallV wallv16 = new WallV();
        addObject(wallv16,599,169);
        wallv16.setLocation(596,165);
        WallV wallv17 = new WallV();
        addObject(wallv17,755,167);
        wallv17.setLocation(755,165);
        Star star7 = new Star();
        addObject(star7,305,220);
        Star star8 = new Star();
        addObject(star8,452,238);
        Star star9 = new Star();
        addObject(star9,620,232);
        Star star10 = new Star();
        addObject(star10,771,240);
        Star star11 = new Star();
        addObject(star11,863,343);
        Star star12 = new Star();
        addObject(star12,859,474);
        Star star13 = new Star();
        addObject(star13,849,565);
        wall14.setLocation(362,500);
        Bush bush2 = new Bush();
        addObject(bush2,171,261);
        Bush bush3 = new Bush();
        addObject(bush3,169,557);
        wallv17.setLocation(754,149);
        wallv16.setLocation(593,150);
        wallv15.setLocation(433,151);
        Reset3 reset3 = new Reset3();
        addObject(reset3,724,24);
        reset3.setLocation(707,21);
        Reset2 reset22 = new Reset2();
        addObject(reset22,703,28);
        reset22.setLocation(712,20);
    }
}
