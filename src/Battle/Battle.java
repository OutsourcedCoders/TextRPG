/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;
import Character.*;
import java.util.Scanner;
/**
 *
 * @author BensMacMini
 */
public class Battle {
    private Player p1;
    /* creates an array of enemies for multiple encounters
    private Enemies[] e1;
    */
    //-----these lines won't work for future builds-----// START
    private Enemies e1;
    //-----these lines won't work for future builds-----// END
    private Enemies temp;
    private boolean win = false;
    public Battle(Player p1, /*see below int[] ID*/ int ID){
        this.p1 = p1;
        /* for multiple monster spawning
        for(int i=0;i<ID.length;i++){
            this.e1[i] = temp.createType(ID[i]);
        }*/
        //-----these lines won't work for future builds-----// START
        this.e1 = temp.createType(ID);
        //-----these lines won't work for future builds-----// END
    }
    public void encounter(){
        Scanner sc = new Scanner(System.in);
        String input;
        boolean inBattle = true;
        boolean userChosen = false;
        while(inBattle){
            /* First check to see what the player does
            */
            System.out.println("What will you do?");
            while(!userChosen){
                input = sc.nextLine();
                switch(input.toLowerCase()){
                    case "attack":
                        e1.takeDamage(p1.onAttack());
                        userChosen = true;
                        break;
                    default:
                        System.out.println("Sorry, right now you can only choose \"attack\"");
                }
            }

            /*make sure the monster didn't die first
            (a dead enemy can't attack)*/
            //-----these lines won't work for future builds-----// START
            if(e1.checkIfDead()){
                inBattle = false;
                win = true;
            }
            //-----these lines won't work for future builds-----// END
            /*Responce by monster is a different "step". would normally be
            a "for-in" loop through an array of monster with different attacks*/
            else{
                p1.takeDamage(e1.onAttack());
            }
            userChosen = false;
        }
        if(win){
            //Continue
            System.out.println("Congrats, You Win!");
        }
        else{
            //Game Over
        }
    }
}
