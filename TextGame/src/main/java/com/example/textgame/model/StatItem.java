/**
 * @author Bug (Alyssa Morley)
 * @createdOn 8/7/2024 at 7:01 PM
 * @projectName TextGame
 * @packageName com.example.textgame.model;
 */
package com.example.textgame.model;

public class StatItem extends Item{
    private int healthStat;

    public StatItem(String name, String description, int healthStat) {
        super(name, description);
        setHealthStat(healthStat);
    }

    public void useItemOnCharacter(Character input){
        input.addToHealth(getHealthStat());
    }


    public int getHealthStat() {
        return healthStat;
    }

    private void setHealthStat(int healthStat) {
        this.healthStat = healthStat;
    }
}
