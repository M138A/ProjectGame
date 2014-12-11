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
    int spawnCounter = 0;  
    int Score = 0;
/** 
 *  Function counts till 5, 7 or 9 depending on the Boat when hitting the Dock1.class and than executes the MoveToExit
**/
public void Initiate() {
    movement(); 
    MouseMovementLeftRight();
    StopBoat();
    Colission();
} 

public void ExitHarbor(int k)    
 {  
      if (isTouching(Dock1.class)){
          if (spawnCounter > k) {  
          spawnCounter = 0;
          MoveToExit();
        }
        spawnCounter++;
        }

    }     
    
public void MoveToExit() {
      slow = 1;
      setLocation(getX(), getY() - 100);
      setRotation(180);    
}
        
/**  
 *  Function removes the object which crashes into another object from the class BoatBig
*/
    public void Colission() {
        Actor haven = getOneIntersectingObject(Havenfoot2.class);
        Actor boat = getOneIntersectingObject(MainBoat.class);
       if (haven != null || boat != null) {
            World world;
            world = getWorld();
            world.removeObject(this);
            
                     
            } 
        }
/**
 * Function which makes the movement happen and also rotates at the given X and Y
*/

public void movement() {
    move(-slow);
     if (getX() <=  300 && getY() == 61) {
       for(int i = 0; i <= 90; i++) {
          //Greenfoot.delay(1);
            setRotation(-i);
            setLocation(getX() - slow, getY());
        }
    
}
}
/**
 * Function to drag the boat from left to right to the dock
*/
public void MouseMovementLeftRight() {
  if (Greenfoot.mouseDragged(this) == true){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation(mouse.getX(), getY());
    }
}

/**
 * Function which set var slow to 0 so the boat will between a certain X and Y
*/
public void StopBoat() {

    Actor boats = getOneIntersectingObject(ColissionDock.class);
        if (boats != null){
            slow = 0;
        }
    
}
}