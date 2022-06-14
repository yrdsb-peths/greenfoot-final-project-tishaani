import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWinScreen here.
 * 
 * @author Tishaani Ragavan
 * @version June 2022
 */
public class YouWinScreen extends Actor
{
    /**
     * Act - do whatever the YouWinScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public YouWinScreen()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
        Greenfoot.playSound("winSound.mp3");
    }
}
