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
public enum EnemyType{
    // New monsters are stored here
    SLIME ("Slime",10,1),
    ZOMBIE ("Zombie",40,3),
    DEFAULT ("Missing_No", 999, 999);
    private final Entity enemy;
    EnemyType(String Nm, int HP, int Att){
        enemy = new Entity(Nm,HP,Att);
    }
    public Entity createEnemy(){
        return enemy;
    }
            
}
