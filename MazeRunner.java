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
    int mazeRunnerLives;
    //Create contructor method. 
     public MazeRunner(int lives)
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
        mazeRunnerLives = lives;
    }
    public void act()
    {
        // Add your action code here.
        slideAround();
        collectBoost();
        maxSpeed();
        loseLife();
        mazeRunnerHit();
        youWin();
        youLose();
    }
    public void mazeRunnerHit()
    {
        if (hitEnemy())
        {
            setLocation(40,560);
        }
    }
    public void loseLife()
    {
        if (hitEnemy())
        {
            mazeRunnerLives--;
        }
    }
    public void youLose()
    {
        if (mazeRunnerLives == 0)
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
    public void youWin()
    {
        if(isTouching(YouWinPlatform.class))
        {
            getWorld().addObject(new YouWinScreen(),getWorld().getWidth()/2 ,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
