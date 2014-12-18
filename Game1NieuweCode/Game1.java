import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game1 extends World
{
    private Score score;
    private Counter theCounter;
    public Score getScore() {
        return score;
    }

    public Game1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        
        prepare();
    }
    public Counter getCounter()
    {
        return theCounter;
    }
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
                addObject(new Boat(30,1,700,new Exit("paars")), 800, 61);
            } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
            {
                addObject(new Boat(20,2,500,new Exit("groen")), 800, 61);
            } else 
            {
                addObject(new Boat(10,3,300,new Exit("geel")), 800, 61);
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
                addObject(new Boat(30,1,700,new Exit("paars")),800,61);
            } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
            {
                addObject(new Boat(20,2,500,new Exit("groen")), 800, 61);
            } else 
            {
                addObject(new Boat(10,3,300,new Exit("geel")), 800, 61);
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
                addObject(new Boat(30,1,700,new Exit("paars")),800,61);
            } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
            {
                addObject(new Boat(20,2,500,new Exit("groen")), 800, 61);
            } else 
            {
                addObject(new Boat(10,3,300,new Exit("geel")), 800, 61);
            }
            spawnRandom = 0;
        }  
        spawnCounter++;  
    }
    public void prepare()
    {
        Exit exit1 = new Exit("paars");
        addObject(exit1, 885, 615);
        Exit exit2 = new Exit("groen");
        addObject(exit2, 885, 472);
        Exit exit3 = new Exit("geel");
        addObject(exit3, 885, 340);
        Dock dock1 = new Dock();
        addObject(dock1, 335, 825);
        Dock dock2 = new Dock();
        addObject(dock2, 127, 825);
        Dock dock3 = new Dock();
        addObject(dock3, 542, 825);
        Boat boat1 = new Boat(30,1,700,exit1);
        addObject(boat1, 500,61);
        Boat boat2 = new Boat(20,2,500,exit2);
        addObject(boat2, 800,61);
        Boat boat3 = new Boat(10,3,300,exit3);
        addObject(boat3, 650,61);
        Haven havencolission = new Haven("havencolission");
        addObject(havencolission, 228, 825);
        Haven havencolission2 = new Haven("havencolission");
        addObject(havencolission2,  22, 825);
        Haven havencolission3 = new Haven("havencolission");
        addObject(havencolission3, 436, 825 );
        Haven havenfooter = new Haven("havenfooter");
        addObject(havenfooter, 771, 827);
        ColissionDock colDock1 = new ColissionDock();
        addObject(colDock1, 539, 881);
        ColissionDock colDock2 = new ColissionDock();
        addObject(colDock2, 329, 881);
        ColissionDock colDock3 = new ColissionDock();
        addObject(colDock3, 126, 881);
        Haven rightbalk1 = new Haven("rightbalk");
        addObject(rightbalk1, 885, 750);
        Haven rightbalk2 = new Haven("rightbalk");
        addObject(rightbalk2, 885, 700);
        Haven rightbalk3 = new Haven("rightbalk");
        addObject(rightbalk3, 885, 540);
        Haven rightbalk4 = new Haven("rightbalk");
        addObject(rightbalk4, 885, 405);
        Haven rightbalk5 = new Haven("rightbalk");
        addObject(rightbalk5, 885, 275);
        Haven rightbalk6 = new Haven("rightbalk");
        addObject(rightbalk6, 885, 200);
        Haven havenbreak = new Haven("havenbreak");
        addObject (havenbreak,612, 145);
        score = new Score();
        addObject(score, 840, 790);
        theCounter = new Counter();
        addObject(theCounter, 840, 820);
    }
}
