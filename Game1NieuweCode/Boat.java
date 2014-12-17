import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Actor
{
    private int size;
    private int speed;
    private int slow = 1;
    private boolean leeg = false;
    private boolean boatEmpty = false;
    private int spawnCounter = 0;  
    private int id;
    private int time;

    public void act() {
         MoveBoat();
         MoveMouse();
         ExitHarbor(time);
         Dock();
         Colission();
         
         
    }
    public Boat(int newSize, int i, int t) {
        size = newSize;
        id = i;
        time = t;
        setImage(id);
    }

    public void setImage(int i) {
        if (!leeg) {
            setImage(new GreenfootImage("Boat"+i+".png"));
        }
        else {
            setImage(new GreenfootImage("Boatleeg"+i+".png"));
        }
    }
    
    public void MoveBoat() {
        move(-slow);
        if (getX() <=  300 && getY() == 61) {
            for(int i = 0; i <= 90; i++) {
                setRotation(-i);
                setLocation(getX() - slow, getY());
            }

        }
    }

    public void MoveMouse() {
        if (Greenfoot.mouseDragged(this) == true){
            MouseInfo mouse = Greenfoot.getMouseInfo();

            if (leeg){
                setLocation(getX(), mouse.getY());
            }
            else {
                setLocation(mouse.getX(),getY());
            }
        }
    }
        public void Colission() {
        Actor haven = getOneIntersectingObject(Haven.class);
        Actor boat = getOneIntersectingObject(Boat.class);
        if (haven != null || boat != null) {
            World world;
            world = getWorld();
            world.removeObject(this);
        } 
    }
    public void ExitHarbor(int k)    
    {  
        if (isTouching(ColissionDock.class)){
            if (spawnCounter > k) {  
                spawnCounter = 0;
                GoToExit();
                leeg = true;
                setImage(id);
            }
            spawnCounter++;
        }

    }  
    public void GoToExit() {
        slow = 1;
        setLocation(getX(), getY() - 100);
        setRotation(180); 
    }

    public void Dock() {
        Actor boats = getOneIntersectingObject(ColissionDock.class);
        if (boats != null){
            slow = 0;
        }

    }
}
