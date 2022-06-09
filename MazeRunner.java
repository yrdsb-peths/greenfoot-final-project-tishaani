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
        maxSpeed();
        mazeRunnerHit();
        youWin();
    }
    public void mazeRunnerHit()
    {
        if (hitEnemy())
        {
            setLocation(40,560);
        }
    }
    public void youWin()
    {
        if(isTouching(YouWinPlatform.class))
        {
            getWorld().addObject(new YouWinScreen(),getWorld().getWidth()/2 ,getWorld().getHeight()/2);
        }
    }
}
