import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hiu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hiu extends Actor
{
    /**
     * Act - do whatever the Hiu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hiu()
    {
        setImage("Hiu.png");
    }
    public void act() 
    {
        setLocation(getX()+2, getY());
        //turn(1);
     
    if(isTouching(Ikan.class))
        {
            removeTouching(Ikan.class);
            
            Greenfoot.setWorld(new OverPage());
            
            Greenfoot.stop(); 
        
        }
        if(getX()>490){
        setLocation(0, getY());
        getWorld().removeObject(this);
    } 
}
    
}
