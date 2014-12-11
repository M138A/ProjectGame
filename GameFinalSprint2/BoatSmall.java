import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoatSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoatSmall extends MainBoat
{
    /**
     * Act - do whatever the BoatSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    movement(); 
    MouseMovementLeftRight();
    StopBoat();
    ExitHarbor(500);
    Colission();

    }    
}
