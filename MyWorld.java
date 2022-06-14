import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Tishaani Ragavan
 * @version June 2022
 */
public class MyWorld extends World
{
    //GreenfootSound backgroundMusic = new GreenfootSound("backgroundMusic.mp3");

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        //backgroundMusic.playLoop();
        addObject(new MoveKeys(), 300,300);

        prepare();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PressStart pressStart = new PressStart();
        addObject(pressStart,288,120);
        pressStart.setLocation(300,200);
        WelcomeLabel welcomeLabel = new WelcomeLabel();
        addObject(welcomeLabel,298,77);
        GoalGame goalGame = new GoalGame();
        addObject(goalGame,298,359);
        goalGame.setLocation(296,355);
    }
}
