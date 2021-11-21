import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverPage extends World
{

    /**
     * Constructor for objects of class OverPage.
     * 
     */
    public OverPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 300, 1); 
        prepare();
        setBackground("OverPage.jpg"); 
    }

    public void prepare()
    {
        GameOver gameover = new GameOver();
        addObject(gameover,250,50); 

        showText("KALAH!", 250, 120);
        showText("YOUR SCORE : " + MyWorld.score.getValue()+" points", 250,150); 
        Quit quit = new Quit();
        addObject(quit,252,225);
    }
}
