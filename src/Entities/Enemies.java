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
//Change to enum *see EnemiesList for example*
public class Enemies extends Entity {
    public Enemies(String name, int maxHP, int attack) {
        super(name, maxHP, attack);
    }
    public Entity createType(EnemiesList ID){
        Entity temp;
        switch(ID){
            case SLIME:
                temp = new Entity("slime",10,1);
                return temp;
            default:
                temp = new Entity("Missing_No", 999, 999);
                System.out.println("you tried to use an ID that doesn't exist");
                return temp;
        }
    }
}
