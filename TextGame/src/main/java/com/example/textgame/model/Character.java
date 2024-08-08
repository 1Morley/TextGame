/**
 * @author Bug (Alyssa Morley)
 * @createdOn 8/7/2024 at 6:41 PM
 * @projectName TextGame
 * @packageName com.example.textgame.model;
 */
package com.example.textgame.model;

import java.util.ArrayList;

public class Character {
    private String name;
    private int health;
    private ArrayList inventory;

    public Character(String name) {
        setName(name);
        setHealth(100);
        setInventory(new ArrayList<String>());
    }


    public void addToHealth(int amount){
        setHealth(getHealth() + amount);
    }



    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.isEmpty() || name.length() < 1){
            throw new NullPointerException("NAME CANNOT BE EMPTY");
        }
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    private ArrayList getInventory() {
        return inventory;
    }

    private void setInventory(ArrayList inventory) {
        this.inventory = inventory;
    }
}
