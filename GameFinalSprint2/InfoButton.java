import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class InfoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoButton extends Buttons
{
    public boolean textShowed = false;

    /**
     * Act - do whatever the InfoButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //e
        if(Greenfoot.mouseClicked(this)){

            if(!textShowed){                
                addImage();
            }
            else if (textShowed){
                removeImage();                
            }
        }
    }    

    private void addImage(){
        InfoText text = new InfoText();
        getWorld().addObject(text,500,450);
        textShowed = true;
    }

    public void removeImage(){
        List a = getWorld().getObjects(InfoText.class);
        getWorld().removeObjects(a);
        textShowed= false;
    }
}
