import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Container here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Containergame2 extends Vehicle
{
    private final String bigContainerDarkImagePath = "images/Small/big-dark-empty.png";
    private final String bigContainerLightImagePath = "images/Small/big-light-empty.png";
    private final String smallContainerDarkImagePath = "images/Small/small-dark-empty.png";
    private final String smallContainerLightImagePath = "images/Small/small-light-empty.png";
    private final String bigContainerDarkImageFullPath = "images/Small/big-dark.png";
    private final String bigContainerLightImageFullPath = "images/Small/big-light.png";
    private final String smallContainerDarkImageFullPath = "images/Small/small-dark.png";
    private final String smallContainerLightImageFullPath = "images/Small/small-light.png";
    public int speed = 1;
    public boolean loaded = false;
    public int t;

    /** do whatever the Container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Containergame2(){

        setContainer(getRandomContainerType());
    }

    public void setContainer(int type)
    {
        t = type;
        if(loaded == false){
            switch(type)
            {
                case 0: setImage(bigContainerDarkImagePath);
                break;
                case 1: setImage(bigContainerLightImagePath);
                break;
                case 2: setImage(smallContainerDarkImagePath);
                break;
                case 3: setImage(smallContainerLightImagePath);
                break;
            }
        }
        else{
            switch(type)
            {
                case 0: setImage(bigContainerDarkImageFullPath);
                break;
                case 1: setImage(bigContainerLightImageFullPath);
                break;
                case 2: setImage(smallContainerDarkImageFullPath);
                break;
                case 3: setImage(smallContainerLightImageFullPath);
                break;
            }
        }
    }

    public int getRandomContainerType(){
        return Greenfoot.getRandomNumber(4);
    }

    public void act() 
    {
        // Add your action code here.
        if(isAtEdge() && checkLoadingState()){
            getWorld().removeObject(this);
            return;
        }
        if(atTruckStop())
        {
            return;
        }

        if(canAddTruck())
        {
            addTruck();
        }        
        if(getTruckState())
        {
            moveContainer();
            return;
        }
        
        if(checkLoadingState())
        {
            this.allowTruckToMove();
            getPullingTruck().allowTruckToMove();
            return;
        }
        
    }    

    public boolean checkLoadingState(){
        return loaded;
    }

    public void moveContainer()
    {
        this.setLocation(getX(), getY() - speed);

    }

    private Truck getPullingTruck()
    {
        Truck x = (Truck) getWorld().getObjects(Truck.class).get(0);

        return x;
    }

    private boolean atTruckStop()
    {
        if(getY() == 450 && !checkLoadingState()){
            Truck x = getPullingTruck();
            if(x != null)
            {

                stopTruck();
                x.stopTruck();
                return true;

                
            }
            return false;
        }
        return false;

    }

    private void addTruck()
    {
        Truck x = new Truck(4);
        getWorld().addObject(x,108,900);
    }

    private boolean canAddTruck()
    {
        if(getY() == 2){
            return true;
        }
        else{
            return false;
        }

    }
}
