import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,0,10*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,0,9*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,0,8*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,2*50,11*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,2*50,10*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,1*50,8*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,2*50,8*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,3*50,8*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,4*50,8*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,4*50,10*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,6*50,11*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,6*50,10*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,6*50,9*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,6*50,8*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,6*50,7*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,6*50,6*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,5*50,6*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,5,5);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,5*50,4*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,5*50,3*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,2*50,6*50);
        mazeBlock21.setLocation(2,6);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,2*50,5*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,2*50,3*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,2*50,2*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,1*50,2*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,3*50,1*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,4*50,1*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,5*50,1*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,6*50,2*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,0,0);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,7*50,2*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,8*50,0);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,9*50,1*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,10*50,2*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,10*50,3*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,9*50,4*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,8*50,4*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,7*50,6*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,10*50,5*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,10*50,6*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,10*50,7*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,10*50,8*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,9*50,6*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,9*50,9*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,8*50,9*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,8*50,10*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,10*50,11*50);
        MazeRunner mazeRunner = new MazeRunner(3);
        addObject(mazeRunner,41,565);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,33,344);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,157,106);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,445,251);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,98,299);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,499,599);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,300,599);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,98,598);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,300,201);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,550,52);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,550,199);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,550,447);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,599,52);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,599,199);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,598,447);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,596,549);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,597,599);
        SpeedBoost speedBoost4 = new SpeedBoost();
        addObject(speedBoost4,397,49);
        SpeedBoost speedBoost5 = new SpeedBoost();
        addObject(speedBoost5,246,576);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,148,299);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,401,599);
        EnemyFlyer enemyFlyer = new EnemyFlyer();
        addObject(enemyFlyer,152,246);
        EnemyFlyer enemyFlyer2 = new EnemyFlyer();
        addObject(enemyFlyer2,306,151);
        EnemyFlyer enemyFlyer3 = new EnemyFlyer();
        addObject(enemyFlyer3,353,356);
        YouWinPlatform youWinPlatform = new YouWinPlatform();
        addObject(youWinPlatform,549,573);
    }
    
}
