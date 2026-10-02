import greenfoot.*;
/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor  
{
    // instance variables - replace the example below with your own
    private int hp;
    private int ap;
    private String name; 
    private GreenfootImage img; 
    private boolean outStatus; 
    private Attack attack; 
    private String type; 
    public Pokemon(int hp, int ap, String name, String atack, String type) {
        this.hp = hp;
        this.ap = ap; 
        this.name = name; 
        this.img = new GreenfootImage(name+".png");
        setImage(this.img); 
    }
    
    public String getType() {
    return this.type;
}
public void attack(String aName, User enemy) {
}
public void takeDamage(int amount) {
    this.hp-=amount; 
}
public void heal() {
    this.hp++;
}
public void printAttack() {
}
public int getAttackPower(String attackName, User enemy){
    return 0;
}
}
