import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game1 extends World
{
private int spawnCounter = 0;  
  
public void act() {  
   
    if (spawnCounter > 500) {  
        spawnCounter = 0;
        double spawnRandom = Math.random();
        if (spawnRandom <= 0.33)
        {
            addObject(new BoatBig(),800,61);
        } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
        {
            addObject(new BoatMedium(), 800, 61);
        } else 
        {
            addObject(new BoatSmall(), 800, 61);
        }
        spawnRandom = 0;
    }  
    spawnCounter++;  

}

    public game1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900,900, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Haven haven = new Haven();
        addObject(haven, 455, 865);
        Dock1 dock1 = new Dock1();
        addObject(dock1, 102, 786);
        haven.setLocation(450, 864);
        BoatBig boatbig = new BoatBig();
        addObject(boatbig, 300, 57);
        boatbig.setLocation(809, 61);
        boatbig.setLocation(420, 61);
        dock1.setLocation(113, 774);
        dock1.setLocation(119, 749);
        Dock1 dock13 = new Dock1();
        addObject(dock13, 545, 756);
        dock13.setLocation(539, 749);
        Dock1 dock14 = new Dock1();
        addObject(dock14, 343, 753);
        dock14.setLocation(322, 750);
        BoatBig boatbig2 = new BoatBig();
        addObject (boatbig2,600, 61);
        removeObject(boatbig);
        Havenfoot2 havenfoot2 = new Havenfoot2();
        addObject(havenfoot2, 618, 214);
        havenfoot2.setLocation(615, 154);
        ExitSmall exitS = new ExitSmall();
        addObject (exitS, 896,283);
        ExitBig exitB = new ExitBig();
        addObject (exitB, 896, 576);
        ExitMedium exitM = new ExitMedium();
        addObject (exitM, 896, 420);
    }
}
