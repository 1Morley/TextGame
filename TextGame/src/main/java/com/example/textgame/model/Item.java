/**
 * @author Bug (Alyssa Morley)
 * @createdOn 8/7/2024 at 6:56 PM
 * @projectName TextGame
 * @packageName com.example.textgame.model;
 */
package com.example.textgame.model;

public class Item {
    private String name;
    private String description;

    public Item(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new NullPointerException("ITEM NAME CANNOT BE EMPTY");
        }
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        if(name == null || name.isEmpty()){
            throw new NullPointerException("ITEM DESCRIPTION CANNOT BE EMPTY");
        }
        this.description = description;
    }
}
