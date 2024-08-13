package com.example.textgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoadData {
    public HashMap<String, String> Data(File file){
        String regex = "([^,]+),\\s([^,]+)";
        Pattern pattern = Pattern.compile(regex);
        HashMap<String, String> storyMapping = new HashMap<String, String >();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    storyMapping.put(matcher.group(1), matcher.group(2));
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return storyMapping;
    }
}
