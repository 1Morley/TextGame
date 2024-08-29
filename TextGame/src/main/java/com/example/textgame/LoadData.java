package com.example.textgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LoadData {
    public String[] Data(File file){
        String[] parts = null;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            StringBuilder connect =  new StringBuilder();
            while ((line = br.readLine()) != null) {
                connect.append(line);
            }
            parts = connect.toString().split("/");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return parts;
    }
}
