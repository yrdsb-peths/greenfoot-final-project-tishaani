import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pressStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pressStart extends Actor
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
