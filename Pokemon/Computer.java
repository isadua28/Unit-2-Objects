import greenfoot.*;
/**
 * Write a description of class Computer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer extends User
{
    public Computer(String name){
        this.name = name;
    }
    public static void switchPokemon(User user, Pokemon p) {
        user.setPokemon(p);
    }
}
