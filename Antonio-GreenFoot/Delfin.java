import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Delfin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delfin extends Actor
{
    /**
     * Act - do whatever the Delfin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Delfin (int cantidad){
        setRotation(cantidad);
    }
    
    
    
    public void act()
    
    {
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
    }
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
    }
    if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-5);
    }
        if(Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+5);
    }
        // Add your action code here.
    }
    
    
}
