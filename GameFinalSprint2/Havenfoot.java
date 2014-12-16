import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Havenfoot2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Havenfoot extends Actor
{
    String harbor = "";
    /**
     * Act - do whatever the Havenfoot2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Havenfoot(String harborstuff) {
        harbor = harborstuff;
        setImage();
    
    }
    
    public void setImage() {
        if (harbor == "havencolission") {
            setImage(new GreenfootImage("havencolission.png"));
        }
        if (harbor == "havenfooter") {
            setImage(new GreenfootImage("havenfooter.png"));
        }
    }
    public void act() 
    {
        // test
    }    
}
