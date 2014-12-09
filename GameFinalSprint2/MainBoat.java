import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainBoat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainBoat extends Actor
{ 
    int fast = 8;
    int slow  = 1; 
public void act() 
    {
     
    }   
    public void Colission() {
        Actor haven = getOneIntersectingObject(Havenfoot2.class);
        Actor boat = getOneIntersectingObject(BoatBig.class);
       if (haven != null || boat != null) {
            World world;
            world = getWorld();
            world.removeObject(this);
            
                     
            } 
        }
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

public void MouseMovement() {
  if (Greenfoot.mouseDragged(this) == true){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation (mouse.getX(), getY());

    }
}
/*public void CanSeeWall() {
       Actor maindock = getOneIntersectingObject(Dock1.class);
      if (maindock != null) {
          setLocation(getX()+10, getY() + 10);
          move(0);
        }
    }*/
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