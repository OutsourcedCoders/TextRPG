/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character;

/**
 *
 * @author BensMacMini
 */
public class Character {
    public String name;
    private int hp;
    private int maxHp;
    private int attack;
    public Character(String name, int maxHP,int attack){
        this.name = name;
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.attack = attack;
    }
    public void takeDamage(int attack){
        hp -= attack;
        System.out.println(name + " took " + attack + " damage!");
    }
    
    public int onAttack(){
        return attack;
    }
    
    public String dispayHp(){
        return hp + "/" + maxHp;
    }

    public boolean checkIfDead(){
        if(hp <=0){
            return true;
        }
        else {
            return false;
        }
    }
}
