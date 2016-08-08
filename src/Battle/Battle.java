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
    final private Player p1;
    final private Entity[] e1;
    private final Enemies temp1 =  new Enemies("",0,0);
    private boolean win = false;
    public Battle(Player player /*, int[] ID*/){
        this.e1 = new Entity[6];
        this.p1 = player;
        /* for multiple monster spawning
        for(int i=0;i<ID.length;i++){
            this.e1[i] = temp.createType(ID[i]);
        }*/
        Entity temp2 = temp1.createType(1);
        this.e1[0] = temp2;
    }
    public void encounter(){
        Scanner sc = new Scanner(System.in);
        String input;
        boolean inBattle = true;
        boolean userChosen = false;
        boolean escaped = false;
        System.out.println("A " + e1[0].name + " aproaches");
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
                    case "view hp":
                        System.out.println(p1.name + " has " + p1.dispayHp() + "HP.");
                        System.out.println(e1[0].name + " has " + e1[0].dispayHp() + "HP.");
                        break;
                    case "run":
                        System.out.println("You ran away");
                        escaped = true;
                        inBattle = false;
                        break;
                    default:
                        System.out.println("Comand not recognised, for help type \"help\"");
                }
            }
            /* Make sure the monster didn't die first
            (a dead enemy can't attack) */
            if(e1[0].checkIfDead()){
                System.out.println(e1[0].name + "has been defeated.");
                inBattle = false;
                win = true;
            }
            // if it didn't die, attack.
            p1.takeDamage(e1[0].onAttack());
            //check if the player died.
            if(p1.checkIfDead()){
                inBattle = false;
            }
            userChosen = false;
        }
        if(win){
            //Continue
            System.out.println("Congrats, You Win!");
        }
        else if(escaped){
            System.out.println("After running away,"
                    + " you realize that the game is incomplete. oops.");
        }
        else{
            //Game Over
            System.out.println("Ok, it should have been literally impossible"
                    + "for you to lose...");
        }
    }
}
