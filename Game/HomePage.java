import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{

    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 300, 1); 
        prepare();
        setBackground("HomePage.jpg"); 
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play play = new Play();
        addObject(play,248,166);
        play.setLocation(239,160);
        play.setLocation(275,153);
        play.setLocation(260,165);
        play.setLocation(290,171);
        removeObject(play);
        addObject(play,252,167);
    }
}
