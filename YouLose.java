import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * You lose
 * 
 * @author Tishaani Ragavan
 * @version June 2022
 */
public class YouLose extends Actor
{
    /**
     * Act - do whatever the YouLose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public YouLose()
    {
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
        Greenfoot.playSound("evilLaugh.mp3");
    }
}
