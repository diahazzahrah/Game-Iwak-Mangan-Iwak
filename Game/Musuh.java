import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh extends Actor
{
    int type = 0;
    int speed =1;
    /**
     * Act - do whatever the IkanKecil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Musuh()
    {
        setImage("Musuh0.png");
    }
    public Musuh(int type)
    {
        /*
        String[]img={};
        img[0]="Musuh0.png";
        img[1]="Musuh1.png";
        */
        String img[]={"Musuh0.png","Musuh1.png"};
        setImage(img[type]);
        //setImage("Musuh"+type+".png");
        speed=type+1;
    }
    public void act()
    {
        setLocation(getX()+speed, getY());
        //turn(1);
        if (getX()>480)
        {
            setLocation(0,getY());
        }
        if(isTouching(Ikan.class)){
         MyWorld.score.add(5);
         if(speed==0){
         makan(); 
        }
    }  
}
    void makan()
    {
        getWorld().addObject(new Musuh(Greenfoot.getRandomNumber(9)), Greenfoot.getRandomNumber(100)+20, 20);
        getWorld().removeObject(this); 
    }
}

