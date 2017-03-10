import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Timer extends Actor
{
    private SimpleTimer timer;
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    public int secondsLeft;
    private String prefix;
    
    public Timer()
    {
        this(new String());
    }

    /**
     * Create a new counter, initialised to 0.
     */
    public Timer(String prefix)
    {
        background = getImage();  // get image from class
        value = 0;
        target = 0;
        this.prefix = prefix;
        timer = new SimpleTimer();
        updateImage();
    }
    
    public Timer(String prefix, int seconds) {
        this(prefix);
        secondsLeft = seconds;
    }
    
    public SimpleTimer getTimer() {
        return timer;
    }
    
    /**
     * Animate the display to show the timer in mm:ss format.
     */
    public void act() 
    {
        if(timer.millisElapsed() > 1000 && secondsLeft-- > 0) {
          updateImage();
          timer.mark();
        }
    }
    
    /**
     * Sets a text prefix that should be displayed before
     * the counter value (e.g. "Score: ").
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    /**
     * Update the image on screen to show the current value.
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        String strText;
        int sec = secondsLeft;
        int min = secondsLeft/  60;
        GreenfootImage text = new GreenfootImage(prefix + numWithZeroPrefix(min) + ":" + numWithZeroPrefix(sec), 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
    
    public int getSeconds() {
        return timer.millisElapsed() / 1000;
    }
    
    private String numWithZeroPrefix(int num) {
        return num < 10 ? "0" + num : num + "";
    }
}