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
private int spawnRateCounter = 0;  
public void act() {     
    spawnRateCounter++;
    if( spawnRateCounter <= 700)
    {
        spawnRateSlow();
    } else if (spawnRateCounter >= 700 && spawnRateCounter <= 1400)
    {
        spawnRateMedium();
    } else 
    {
        spawnRateFast();
    }
    
}
    public void spawnRateSlow()
    {
        if (spawnCounter > 500) {  
        spawnCounter = 0;
        double spawnRandom = Math.random();
        if (spawnRandom <= 0.33)
        {
            addObject(new MainBoat(10),800,61);
        } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
        {
            addObject(new MainBoat(20), 800, 61);
        } else 
        {
            addObject(new MainBoat(30), 800, 61);
        }
        spawnRandom = 0;
    }  
    spawnCounter++;  
    }
    public void spawnRateMedium()
    {
        if (spawnCounter > 300) {  
        spawnCounter = 0;
        double spawnRandom = Math.random();
        if (spawnRandom <= 0.33)
        {
            addObject(new MainBoat(10),800,61);
        } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
        {
            addObject(new MainBoat(20), 800, 61);
        } else 
        {
            addObject(new MainBoat(30), 800, 61);
        }
        spawnRandom = 0;
    }  
    spawnCounter++;  
    }
    public void spawnRateFast()
    {
        if (spawnCounter > 200) {  
        spawnCounter = 0;
        double spawnRandom = Math.random();
        if (spawnRandom <= 0.33)
        {
            addObject(new MainBoat(10),800,61);
        } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
        {
            addObject(new MainBoat(20), 800, 61);
        } else 
        {
            addObject(new MainBoat(30), 800, 61);
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

        Dock dock1 = new Dock();
        addObject(dock1, 335, 825);
        Dock dock2 = new Dock();
        addObject(dock2, 127, 825);
        Dock dock3 = new Dock();
        addObject(dock3, 542, 825);
        Havenfoot havencolission = new Havenfoot("havencolission");
        addObject(havencolission, 228, 825);
        Havenfoot havencolission2 = new Havenfoot("havencolission");
        addObject(havencolission2,  22, 825);
        Havenfoot havencolission3 = new Havenfoot("havencolission");
        addObject(havencolission3, 436, 825 );
        Havenfoot havenfooter = new Havenfoot("havenfooter");
        addObject(havenfooter, 771, 827);
        ColissionDock colDock1 = new ColissionDock();
        addObject(colDock1, 539, 881);
        ColissionDock colDock2 = new ColissionDock();
        addObject(colDock2, 329, 881);
        ColissionDock colDock3 = new ColissionDock();
        addObject(colDock3, 126, 881);
    }
}
