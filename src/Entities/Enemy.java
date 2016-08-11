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
public class Enemy extends Entity {
    public Enemy(String name, int maxHP, int attack) {
        super(name, maxHP, attack);
    }
    public Entity createType(EnemyType ID){
        switch(ID){
            case SLIME:
                return EnemyType.SLIME.createEnemy();
            default:
                System.out.println("you tried to use an ID that doesn't exist");
                return EnemyType.DEFAULT.createEnemy();
        }
    }
}
