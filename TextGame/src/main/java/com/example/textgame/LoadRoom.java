package com.example.textgame;

import java.util.HashMap;

public class LoadRoom {

    public HashMap<String, String> frontDoor() {
        HashMap<String, String> frontDoor = new HashMap<>();
        frontDoor.put("Name", "Front Door");
        frontDoor.put("Description", "Nothing to interact with");
        frontDoor.put("Image", "Image");
        frontDoor.put("Item1", "None");
        frontDoor.put("Item2", "None");
        return frontDoor;
    }

    public HashMap<String, String> house() {
        HashMap<String, String> house = new HashMap<>();
        house.put("Name", "House");
        house.put("Description", "Inside the house, covered with black fog");
        house.put("Image", "Image");
        house.put("Item1", "Candlestick");
        house.put("Item2", "Matches");
        return house;
    }

    public HashMap<String, String> basement() {
        HashMap<String, String> basement = new HashMap<>();
        basement.put("Name", "Basement");
        basement.put("Description", "Nothing to interact with");
        basement.put("Image", "Image");
        basement.put("Item1", "None");
        basement.put("Item2", "None");
        return basement;
    }

    public HashMap<String, String> cellar() {
        HashMap<String, String> cellar = new HashMap<>();
        cellar.put("Name", "Cellar");
        cellar.put("Description", "Look at the table");
        cellar.put("Image", "Image");
        cellar.put("Item1", "Gasoline");
        return cellar;
    }

    public HashMap<String, String> mainFloor() {
        HashMap<String, String> mainFloor = new HashMap<>();
        mainFloor.put("Name", "Main Floor");
        mainFloor.put("Description", "Nothing to interact with");
        mainFloor.put("Image", "Image");
        mainFloor.put("Item1", "None");
        mainFloor.put("Item2", "None");
        return mainFloor;
    }

    public HashMap<String, String> closet() {
        HashMap<String, String> closet = new HashMap<>();
        closet.put("Name", "Closet");
        closet.put("Description", "Cat! Pet the cat");
        closet.put("Image", "Image");
        closet.put("Item1", "None");
        return closet;
    }

    public HashMap<String, String> kitchenRoom() {
        HashMap<String, String> kitchenRoom = new HashMap<>();
        kitchenRoom.put("Name", "Kitchen Room");
        kitchenRoom.put("Description", "Interact with the table");
        kitchenRoom.put("Image", "Image");
        kitchenRoom.put("Item1", "Knife");
        kitchenRoom.put("Item2", "Granola Bar");
        return kitchenRoom;
    }

    public HashMap<String, String> livingRoom() {
        HashMap<String, String> livingRoom = new HashMap<>();
        livingRoom.put("Name", "Living Room");
        livingRoom.put("Description", "Look at what’s in the chair");
        livingRoom.put("Image", "Image");
        livingRoom.put("Item1", "None");
        return livingRoom;
    }

    public HashMap<String, String> upstairs() {
        HashMap<String, String> upstairs = new HashMap<>();
        upstairs.put("Name", "Upstairs");
        upstairs.put("Description", "Nothing to interact with");
        upstairs.put("Image", "Image");
        upstairs.put("Item1", "None");
        upstairs.put("Item2", "None");
        return upstairs;
    }

    public HashMap<String, String> bathroom() {
        HashMap<String, String> bathroom = new HashMap<>();
        bathroom.put("Name", "Bathroom");
        bathroom.put("Description", "Look in the mirror");
        bathroom.put("Image", "Image");
        bathroom.put("Item1", "None");
        return bathroom;
    }

    public HashMap<String, String> bedroom() {
        HashMap<String, String> bedroom = new HashMap<>();
        bedroom.put("Name", "Bedroom");
        bedroom.put("Description", "Look outside the window");
        bedroom.put("Image", "Image");
        bedroom.put("Item1", "None");
        return bedroom;
    }

    public HashMap<String, String> master() {
        HashMap<String, String> master = new HashMap<>();
        master.put("Name", "Master");
        master.put("Description", "Look at the nightstand; Mini game to open the music box for key");
        master.put("Image", "Image");
        master.put("Item1", "Key");
        return master;
    }
}
