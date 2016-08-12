/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Items.Item;

/**
 *
 * @author BensMacMini
 */
public class Player implements Entity{
    private String entityName;
    private int hp;
    private int maxHp;
    private int attack;
    public Player(String Nm, int HP, int Att){
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
    
    public Item[] Inventory;
    
    public void useItem(String key){
        int itemSlot = 0;
        for (Item Inventory1 : Inventory) {
            if (Inventory1.name.equals(key) && Inventory1.isUseable) {
                
            }
            else {
                System.out.println("You cannot use that now");
            }
        }
    }
    /* not yet implimented.
    public void Load(){
        
    }
    private int exp;
    private int toNextLv;
    public void levelUp(){
    }
    */
}