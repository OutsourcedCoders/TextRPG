/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;
import Entities.*;
import java.util.Scanner;
/**
 *
 * @author BensMacMini
 */
public class Battle {
    private Player p1;
    private Entity[] e1 = new Entity[6];
    private Enemies temp1;
    private boolean win = false;
    public Battle(Player player, /*see below int[] ID*/ int ID){
        p1 = player;
        /* for multiple monster spawning
        for(int i=0;i<ID.length;i++){
            this.e1[i] = temp.createType(ID[i]);
        }*/
        Entity temp2 = new Entity("Slime",10 ,1 /*create system to replace
                with actual variables*/);
        e1[0] = temp2;
    }
    public void encounter(){
        Scanner sc = new Scanner(System.in);
        String input;
        boolean inBattle = true;
        boolean userChosen = false;
        while(inBattle){
            /* First check to see what the player does */
            System.out.println("What will you do?");
            while(!userChosen){
                input = sc.nextLine();
                switch(input.toLowerCase()){
                    case "attack":
                        e1[0].takeDamage(p1.onAttack());
                        userChosen = true;
                        break;
                    default:
                        System.out.println("Sorry, right now you can only choose \"attack\"");
                }
            }
            /* Make sure the monster didn't die first
            (a dead enemy can't attack) */
            if(!e1[0].checkIfDead()){
                p1.takeDamage(e1[0].onAttack());
            }
            /* Action by monster is in a different "step". Would normally be
            a "for-in" loop through an array of monster
            with different attacks */
            else{
                inBattle = false;
                win = true;
            }
            userChosen = false;
        }
        if(win){
            //Continue
            System.out.println("Congrats, You Win!");
        }
        else{
            //Game Over
            System.out.println("Ok, it should have been literally impossible"
                    + "for you to lose...");
        }
    }
}
