package com.example.textgame.model;

import javafx.scene.image.Image;

public class Room {
    private Item[] items;
    private String name;
    private String description;
    private Image image;

    public Room(String name, String description, Image image) {
        setName(name);
        setDescription(description);
        setImage(image);

    }
    public Room(String name, String description, Image image, Item[] items){
       setName(name);
       setDescription(description);
       setImage(image);
       setItems(items);
    }

    //region getters/Setters
    public String getName() {
        return name;
    }
    private void setName(String name) {
        if(name == null || name.isEmpty()){
            // is IllegalArgumentException the
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }


    public String getDescription() {
        return description;
    }
    private void setDescription(String description) {
        if(description == null || description.isEmpty()){
            // is IllegalArgumentException the
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        this.description = description;
    }

    public Image getImage() {
        return image;
    }
    private void setImage(Image image) {
        if(image == null){
            // is IllegalArgumentException the
            throw new IllegalArgumentException("image cannot be null");
        }
        this.image = image;
    }

    public Item[] getItems() {
        return items;
    }
    private void setItems(Item[] items) {
        if(items == null){
            // is IllegalArgumentException the
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.items = items;
    }


    //endregion





}

