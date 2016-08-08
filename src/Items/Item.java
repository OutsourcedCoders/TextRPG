/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author BensMacMini
 */
public class Item {
    /* Items have a name, a type, and an effect. Due to this, they must have
    seperate types. i.e. Armor, potion, etc...*/
    public String name;
    private String type;
    private  int id;
    public boolean isUseable;
    public Item(String name, String Type, int ID) {
        this.name = name;
        this.type = Type;
        this.id = ID;
        if("potion".equals(type)){
            
        }
    }
    
   public void onUse(){
        if(isUseable){
            switch(type){
                //consumeabe
                case "potion":
                    
                    break;
            }
        }
   }
}
