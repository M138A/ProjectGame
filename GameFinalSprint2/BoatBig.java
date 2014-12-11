    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoatBig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoatBig extends MainBoat
{
   
public void act() 
    {
   movement(); 
   MouseMovementLeftRight();
   StopBoat();
   ExitHarbor(200);
   Colission();
   }      
}
//Move's the boat forward and slows down when the boat is in the harbor