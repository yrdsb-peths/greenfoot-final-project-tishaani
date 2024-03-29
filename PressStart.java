import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Label to indicate how to start
 * 
 * @author Tishaani Ragavan
 * @version June 2022
 */
public class PressStart extends Actor
{
    /**
     * Act - do whatever the pressStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("s"))
        {
            Greenfoot.setWorld(new MazeWorld());
        }
    }
}
