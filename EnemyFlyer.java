import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Snake enemies as obstacles.
 * 
 * @author Tishaani Ragavan
 * @version June 2022
 */
public class EnemyFlyer extends Enemies
{
    /**
     * Act - do whatever the EnemyFlyer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(5);
        wrapAtEdge();
    }
    public EnemyFlyer()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
}
