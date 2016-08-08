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
public class Player extends Entity{
    public Item[] Inventory;  
    public Player(String name, int maxHP, int attack) {
        super(name, maxHP, attack);
        Inventory = new Item[20];
    }

    
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
    */
}