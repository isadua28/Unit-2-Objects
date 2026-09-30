import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,511,214);
        pizza.setLocation(502,214);
        Topping topping = new Topping("Cheese");
        addObject(topping,502,214);
        pizza.setLocation(534,193);
        pizza.setLocation(495,213);
        pizza.setLocation(530,174);
        pizza.setLocation(506,209);
        Topping topping2 = new Topping("Olives");
        addObject(topping2,506,209);
        topping.setLocation(305,94);
        pizza.setLocation(275,240);
        topping.setLocation(266,226);
        topping2.setLocation(352,121);
        topping.setLocation(297,223);
        pizza.setLocation(274,252);
        pizza.setLocation(275,239);
        topping2.setLocation(270,242);
        pizza.setLocation(271,240);
        Topping topping3 = new Topping("Mushrooms");
        addObject(topping3,273,243);
        pizza.setLocation(267,241);
    }
}
