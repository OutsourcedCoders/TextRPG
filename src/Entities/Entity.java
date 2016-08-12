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
public interface Entity {
    public String entityName();
    public int attack();
    public int hp();
    public void takeDamage(int attack);
    public boolean checkIfDead();
}
