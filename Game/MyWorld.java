import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score: ");
    static Counter hp = new Counter("Hp: ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 300, 1);
        setBackground("background.jpg");
        prepare();
    }
   public void act(){
        if(Greenfoot.getRandomNumber(100)<3)
        {
            addObject(new Musuh(), 390, Greenfoot.getRandomNumber(290));
        }
        if(Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new Hiu(),390, Greenfoot.getRandomNumber(290));
        }
        if(MyWorld.score.getValue()>=150)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new WinPage()); 
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ikan ikan =  new Ikan();
        addObject(ikan, 171, 198);

        Hiu hiu = new Hiu();
        addObject(hiu, 200, 250);
        removeObject(hiu);

        addObject(score, 50,25);
        score.setValue(0);

        hp.setValue(1); 
        ikan.setLocation(405,147);

        Hiu hiu2 = new Hiu();
        addObject(hiu2,80,71);

        hiu2.setLocation(219,82);
        Hiu hiu3 = new Hiu();
        addObject(hiu3,184,295);
        Musuh musuh6 = new Musuh();
        addObject(musuh6,132,185);
        hiu2.setLocation(301,22);
        hiu3.setLocation(140,297);
        Musuh musuh4 = new Musuh();
        addObject(musuh4,355,228);
        Musuh musuh5 = new Musuh();
        addObject(musuh5,20,140);

        hiu2.setLocation(211,65);
    }
}
