import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinPage extends World
{

    /**
     * Constructor for objects of class WinPage.
     * 
     */
    public WinPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 300, 1); 
        setBackground("Winpage.jpg"); 
        prepare();
    }
    
    public void prepare()
    {
        Winner winner = new Winner();
        addObject(winner,250,100); 
        Replay replay = new Replay();
        addObject(replay,249,225);
    }
}
