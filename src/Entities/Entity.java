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
public class Entity {
    public String name;
    private int hp;
    private int maxHp;
    private int attack;
    public Entity(String name, int MaxHP,int attack){
        this.name = name;
        this.maxHp = MaxHP;
        this.hp = MaxHP;
        this.attack = attack;
    }
    public void takeDamage(int attack){
        hp = hp - attack;
        System.out.println(name + " took " + attack + " damage!");
    }
    
    public int onAttack(){
        return attack;
    }
    
    public String dispayHp(){
        return hp + "/" + maxHp;
    }

    public boolean checkIfDead(){
        return hp <= 0;
    }
}
