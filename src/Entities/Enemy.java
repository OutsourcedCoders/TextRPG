/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author BensMacMini
 */
public enum Enemy implements Entity{
    // New monsters are stored here
    SLIME   ("Slime",10,1),
    ZOMBIE  ("Zombie",40,3),
    DEFAULT ("Missing_No", 999, 999);
    private String entityName;
    private int hp;
    private int maxHp;
    private int attack;
    Enemy(String Nm, int HP, int Att){
        this.entityName = Nm;
        this.hp        = HP;
        this.maxHp     = HP;
        this.attack    = Att;
    }
    @Override
    public String entityName(){
        return entityName;
    }
    @Override
    public int attack(){
        return attack;
    }
    @Override
    public int hp(){
        return hp;
    }
    @Override
    public void takeDamage(int attack){
        hp = hp - attack;
    }
    @Override
    public boolean checkIfDead(){
        return hp<=0;
    }
}
