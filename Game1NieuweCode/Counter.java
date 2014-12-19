import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 3;
    public void Counter() 
    {
        setImage(new GreenfootImage("Lives : 3", 20, Color.WHITE, Color.BLACK));
    }    
    public void bumpCount(int amount)
    {
        totalCount -= amount;
        if (totalCount == 0)
        {
            Greenfoot.stop();
        }
        setImage(new GreenfootImage("Lives left: " + totalCount, 20, Color.WHITE, Color.BLACK));
    }
}
