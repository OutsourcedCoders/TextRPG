/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;
import Entities.*;
import static Entities.Enemy.*;
import java.util.Scanner;
/**
 *
 * @author BensMacMini
 */
public class Battle {
    final private Player p1;
    final private Enemy[] e1;
    private final Enemy temp1 =  DEFAULT;
    private boolean win = false;
    public Battle(Player player /*, int[] ID*/){
        this.e1 = new Enemy[6];
        this.p1 = player;
        Enemy temp2 = SLIME;// for multiple or random spawns, handle elsewhere.
        this.e1[0] = temp2;
    }
    //could split class here, have seperate encounter class that handles spawning
    public void encounter(){
        Scanner sc = new Scanner(System.in);
        String input;
        boolean inBattle = true;
        boolean userChosen = false;
        boolean escaped = false;
        System.out.println("A " + e1[0].entityName() + " aproaches");
        while(inBattle){
            /* First check to see what the player does */
            System.out.println("What will you do?");
            while(!userChosen){
                input = sc.nextLine();
                switch(input.toLowerCase()){
                    case "attack":
                        e1[0].takeDamage(p1.attack());
                        userChosen = true;
                        break;
                    case "view hp":
                        System.out.println(p1.entityName() + " has " + p1.hp() + "HP.");
                        System.out.println(e1[0].entityName() + " has " + e1[0].hp() + "HP.");
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
                System.out.println(e1[0].entityName() + "has been defeated.");
                inBattle = false;
                win = true;
            }
            // if it didn't die, attack.
            p1.takeDamage(e1[0].attack());
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
