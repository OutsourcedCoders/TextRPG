/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textrpg;

import Battle.Battle;
import Character.Player;

/**
 *
 * @author BensMacMini
 */
public class TextRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player me = new Player("Player_name", 50, 1);
        Battle firstEncounter = new Battle(me, 1);
        firstEncounter.encounter();
    }
    
}
