import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    private String color;
    private int points;

    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Exit(String kleur) {
        color = kleur;
        setImage(kleur);
    }

    public void setImage(String kleur) {
        setImage(new GreenfootImage("exit"+kleur+".png"));
    }

    public void act() {
        if (id == 1 && "geel".equals(exit.getColor()))
    }
}
    
    public String getColor()
    {
        return color;
    }
    
}
/* public void Unload() {
Exit exit = new Exit(10);
exit.setSize(90);
if(one.getSize() == true) {
passBoat();
}
else {
World world = getWorld();
world.removeObject(this);
points--;
}
}
public void passBoat() {
points++;
}*/