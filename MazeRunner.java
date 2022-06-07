import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mouse, going through the maze/
 * 
 * @author Tishaani Ragavan
 * @version June 2022
 */
public class MazeRunner extends Movers
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Create contructor method. 
     public MazeRunner()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        // Add your action code here.
        slideAround();
        collectBoost();
<<<<<<< HEAD
        maxSpeed();
=======
>>>>>>> 95243741d896c39694e2b3a5b6d82fa717c1067c
    }
}
