/**
 * @author Bug (Alyssa Morley)
 * @createdOn 8/7/2024 at 6:41 PM
 * @projectName TextGame
 * @packageName com.example.textgame.model;
 */
package com.example.textgame.model;

import java.util.ArrayList;

public class Character {
    private static final int MAX_HEALTH = 100;
    private String name;
    private int health;
    private ArrayList<Item> inventory;

    public Character(String name) {
        setName(name);
        setHealth(MAX_HEALTH);
        inventory = new ArrayList<>();
    }

    public void addToHealth(int amount){
        setHealth(getHealth() + amount);
    }

    public void addItemToInventory(Item addedItem){
        inventory.add(addedItem);
    }

    public void useItemOnSelfFromInventory(int itemIndex){
        Item select = inventory.get(itemIndex);
        if(select instanceof StatItem){
            ((StatItem) select).useItemOnCharacter(this);
            deleteItemFromInventory(itemIndex);
        }
    }

    private void deleteItemFromInventory(int itemIndex){
        inventory.remove(itemIndex);
    }

    public String[] returnItemNameList(){
        String[] returnList = new String[inventory.size()];
        for (int i = 0; i < inventory.size(); i++) {
            returnList[i] = inventory.get(i).getName();
        }
        return returnList;
    }

    public String getFullItemInfo(int itemIndex){
        return inventory.get(itemIndex).toString();
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new NullPointerException("CHARACTER NAME CANNOT BE EMPTY");
        }
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        if(health < 0){
            health = 0;
        }else if(health > MAX_HEALTH){
            health = MAX_HEALTH;
        }
        this.health = health;
    }
    //endregion
}
