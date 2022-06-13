import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Tishaani Ragavan
 * @version June 2022
 */
public class MyWorld extends World
{
    //Label titleLabel = new Label("Maze Runner", 60);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    
    public void act()
    {
        //start the game if the user presses space bar 
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
