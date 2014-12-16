import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleMenuGame1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleMenuGame1 extends World
{

    /**
     * Constructor for objects of class TitleMenuGame1.
     * 
     */
    public TitleMenuGame1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(894, 894, 1); 
        prepare();
    }
    
    private void prepare(){
    
    InstructionsGame1 instruction = new InstructionsGame1();
    addObject(instruction, 447 ,447);
    StartButtonGame1 button = new StartButtonGame1();
    addObject(button,450,750);
    BackButton buttonback = new BackButton();
    addObject(buttonback, 65,65);
    }
}
