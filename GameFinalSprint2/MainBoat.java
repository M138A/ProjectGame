import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainBoat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainBoat extends Actor
{ 
    //Movement variable of the boat
    int fast = 8;
    int slow  = 1; 
public void act() 
    {
     
    }   
///////////////////////////////////////////////////////////////////////////////////////////   
/// Function removes the object which crashes into another object from the class BoatBig///
///////////////////////////////////////////////////////////////////////////////////////////
    public void Colission() {
        Actor haven = getOneIntersectingObject(Havenfoot2.class);
        Actor boat = getOneIntersectingObject(MainBoat.class);
       if (haven != null || boat != null) {
            World world;
            world = getWorld();
            world.removeObject(this);
            
                     
            } 
        }
///////////////////////////////////////////////////////////////////////////////////////////   
/// Function which make the movement happen and also rotates at he given X and Y///////////
///////////////////////////////////////////////////////////////////////////////////////////
    public void movement() {
        move(-slow);
     if (getX() <=  300 && getY() == 61) {
       for(int i = 0; i <= 90; i++) {
          // Greenfoot.delay(1);
            setRotation(-i);
            setLocation(getX() - slow, getY());
         
        
        }
    
}
}
///////////////////////////////////////////////////////////////////////////////////////////   
//////////////Function to drag the boat from left to right to the dock/////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
public void MouseMovement() {
  if (Greenfoot.mouseDragged(this) == true){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation (mouse.getX(), getY());

    }
}
///////////////////////////////////////////////////////////////////////////////////////////   
//////// Function which set var slow to 0 so the boat will between a certain X and Y///////
///////////////////////////////////////////////////////////////////////////////////////////
public void StopBoat() {
    if (getX() >= 102 && getX() <= 136 && getY() == 729) {
       slow = 0;
    }
    else if (getX() >= 305 && getX() <= 339 && getY() == 729){
       slow = 0;
    }
    else if (getX() >= 522 && getX() <= 556 && getY() == 729){
       slow = 0;
    }
    else if (getX() >= 748 && getX() <= 782 && getY() == 729){
       slow = 0;
    }
    
}
}