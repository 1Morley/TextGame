package com.example.textgame;
import java.util.HashMap;

public class LoadRoom {

    public HashMap room(){
        HashMap<String, String> create = new HashMap<>();
        create.put("Name", "Front Door");
        create.put("Description", "The door has markings on it");
        create.put("Image", "Image");
        create.put("Item", "Item");

        //if need
        create.put("Item2", "Item");
        //can loop thought Items to see if the room is intractable
        return create;
    }

    public HashMap House(){
        HashMap<String, String> create = new HashMap<>();
        create.put("Name", "Inside the house");
        create.put("Description", "Covered with black fog");
        create.put("Image", "Image");
        create.put("Item1", "Candle Stick");
        create.put("Item2", "Matches");
        //can loop thought Items to see if the room is intractable
        return create;
    }
}
