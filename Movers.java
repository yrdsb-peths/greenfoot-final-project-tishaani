import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movers extends Actor
{
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("right"))
    {
        setRotation(0);
        move(4);
    }
    if (Greenfoot.isKeyDown("left"))
    {
        setRotation(180);
        move(4);
    }
    if(Greenfoot.isKeyDown("up"))
    {
        setRotation(270);
        move(4);
    }
    if(Greenfoot.isKeyDown("down"))
    {
        setRotation(90);
        move(4);
    }
    }
    public void slideAround()
    {
        int x = getX();
        int y = getY();
       if (Greenfoot.isKeyDown("right"))
    {
        setLocation(x + 4, y);
    }
    if (Greenfoot.isKeyDown("left"))
    {
        setLocation(x - 4, y);
    }
    if(Greenfoot.isKeyDown("up"))
    {
        setLocation(x, y-4);
    }
    if(Greenfoot.isKeyDown("down"))
    {
        setLocation(x, y+4);
    }  
    }
}

