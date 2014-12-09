import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
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
    int medium = 4;
    int slow  = 1; 
///////////////////////////////////////////////////////////////////////////////////////////   
/// Function return's the boolean true if the Actor MainBoat is in the certain X and Y/////
///////////////////////////////////////////////////////////////////////////////////////////
public void CargoCheck() 
 {
       if(!getWorld().getObjects(MainBoat.class).isEmpty()) {         
           Actor boat = (Actor)getWorld().getObjects(MainBoat.class).get(0);
           if (boat.getX()>=102 && boat.getX() <= 136 && boat.getY()==729){           
               setLocation(getX() + 10, getY() +10);
          }
   
      }
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
/// Function which makes the movement happen and also rotates at the given X and Y///////////
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