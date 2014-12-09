import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoatSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoatSmall extends MainBoat
{
    // snelheid boten
    private int
    slow = 2,
    medium = 4,
    fast = 6;
    /**
     * Act - do whatever the BoatSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + slow);
    }    
}
