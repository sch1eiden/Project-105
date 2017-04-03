import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


import java.util.Calendar;
import java.awt.*;
//import javax.swing.*;
/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and several numbers.
 * 
 * @author M Kolling
 * @version 1.0
 */
public class ScoreBoardWin extends Actor
{
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public ScoreBoardWin()
    {
        this(100);
        getWorld().addObject(new Name(),50,50);
    }

    /**
     * Create a score board for the final result.
     */
    public ScoreBoardWin(int score)
    {
        makeImage( "You win  ",MyWorld.name+"  Score: ", score);
    }
    

    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new greenfoot.Color(255,255,255,128));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new greenfoot.Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        greenfoot.Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(greenfoot.Color.WHITE);
        image.drawString(title, 60, 100);
        image.drawString(prefix + score, 60, 200);
        setImage(image);
    }
}
