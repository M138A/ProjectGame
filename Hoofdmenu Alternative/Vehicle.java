import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehicle extends Actor
{
    public boolean truckCanMove = true;
    public boolean trainCanMove = true;
    public boolean getTruckState()
    {
        return truckCanMove;
    }
    public boolean getTrainState()
    {
        return trainCanMove;
    }
    public void stopTruck()
    {
        truckCanMove = false;
    }

    public void allowTruckToMove()
    {
        truckCanMove = true;
    }
    public void stopTrain()
    {
        trainCanMove = false;
    }
    public void allowTrainToMove()
    {
        trainCanMove = true;
    }
}
