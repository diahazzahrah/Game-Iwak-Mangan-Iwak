import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ikan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ikan extends Actor
{
    /**
     * Act - do whatever the Ikan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ikan()
    {
        setImage("Fish.png"); 
    }
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    } 
     private void checkKeyPress()
    {
      if(Greenfoot.mouseDragged(null)){
           MouseInfo mouse = Greenfoot.getMouseInfo();
           setLocation(mouse.getX(), mouse.getY());
      }
    }
    private void checkCollision()
    {
        if(isTouching(Musuh.class))
        {
            removeTouching(Musuh.class);
            MyWorld.score.add(5); 
            Greenfoot.playSound("eating.wav");
        }
        
        
    }
        
}
