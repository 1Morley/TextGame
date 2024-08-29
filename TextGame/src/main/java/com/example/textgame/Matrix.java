package com.example.textgame;

import java.io.File;

public class Matrix {
    String[] storySegments = new String[35];
    int[][] storyConnections = new int[35][35];
    public int[][] connection(){

        String path = "Story/Story/";
        storySegments[0] = data(new File(path + "Intro-Question1.txt"));
        storySegments[1] = data(new File(path + "TowardHouse-Question2.txt"));
        storySegments[2] = data(new File(path + "TowardForest.txt"));

        storySegments[3] = data(new File(path + "OpenDoor-Question3.txt")); //
        storySegments[4] = data(new File(path + "Knock-Question4.txt"));

        storySegments[5] = data(new File(path + "Hide.txt"));
        storySegments[6] = data(new File(path + "RunToStairs.txt"));

        storySegments[7] = data(new File(path + "StankFace-Ending2.txt"));
        storySegments[8] = data(new File(path + "Smile-Question5.txt"));

        storySegments[9] = data(new File(path + "BadFeeling-Ending3.txt"));
        storySegments[10] = data(new File(path + "StayHopeful.txt"));

        storySegments[11] = data(new File(path + "LivingRoom-Question8.txt"));

        storySegments[12] = data(new File(path + "Closet-Question10.txt"));
        storySegments[13] = data(new File(path + "UseFood-Question11.txt"));

        storySegments[14] = data(new File(path + "MasterBedroom-Question14.txt"));
        storySegments[15] = data(new File(path + "Master-Question15.txt"));
        storySegments[16] = data(new File(path + "Bathroom-Question18.txt"));

        storySegments[17] = data(new File(path + "LayOnBed-Ending9.txt"));
        storySegments[18] = data(new File(path + "ExamineNightstand-Question16.txt"));
        storySegments[19] = data(new File(path + "PlayDead-Ending12.txt"));

        storySegments[20] = data(new File(path + "FindWeapon-Question17.txt"));

        storySegments[21] = data(new File(path + "Scared-Ending10.txt"));
        storySegments[22] = data(new File(path + "Brave-Ending11.txt"));

        storySegments[23] = data(new File(path + "Toilet-Ending14.txt"));
        storySegments[24] = data(new File(path + "StayInTheBathroom-Ending13.txt"));

        storySegments[25] = data(new File(path + "TalkToThing.txt"));
        storySegments[26] = data(new File(path + "Surroundings-Question7.txt"));
        storySegments[27] = data(new File(path + "Slow-Ending6.txt"));
        storySegments[28] = data(new File(path + "ExamineKey-Question12.txt"));
        storySegments[29] = data(new File(path + "ExamineSink-Question19.txt"));
        storySegments[30] = data(new File(path + "ExamineThing.txt"));
        storySegments[31] = data(new File(path + "Fast-Ending5.txt"));
        storySegments[32] = data(new File(path + "HideInCloset-Ending8.txt"));
        storySegments[33] = data(new File(path + "HideUnderBed-Ending7.txt"));
        storySegments[34] = data(new File(path + "HideUnderBed-Ending7.txt"));


        storyConnections[0][1] = 1; // Intro -> House
        storyConnections[0][2] = 2; // Intro -> Forest Ending //End

        storyConnections[1][3] = 2; // House -> Open Door
        storyConnections[1][4] = 1; // House -> Knock

        storyConnections[3][5] = 1; // Open door -> Hide
        storyConnections[3][6] = 2; // Open door -> Stairs

        storyConnections[4][7] = 1; // Knock -> Stank Face //End
        storyConnections[4][8] = 2;// Knock -> Smile

        storyConnections[8][9] = 1; // Smile -> Bad feeling //End // Goes somewhere else
        storyConnections[8][10] = 2; // Smile -> Good feeling
        storyConnections[10][11] = 1; //Good feeling -> Living Room

        storyConnections[11][12] = 1; // Living room -> closet
        storyConnections[11][6] = 2; // Living room -> Slowly stairs

        storyConnections[12][13] = 1; // Closet -> Give food
        storyConnections[8][6] = 1; // Closest -> Look further // Cant find where connects

        storyConnections[6][15] = 1; // Stair -> Main bedroom
        storyConnections[6][16] = 2; // Stairs -> Bathroom

        storyConnections[15][17] = 1; // Main bedroom -> Lay on bed //End
        storyConnections[15][18] = 2; // Main bedroom -> Nightstand

        storyConnections[18][19] = 1; // Nightstand -> Play dead //End
        storyConnections[18][20] = 2; // Nightstand -> Find weapon

        storyConnections[20][21] = 1; // Find weapon -> scared //End
        storyConnections[20][22] = 2; // Find weapon -> brave //End

        storyConnections[16][23] = 1; // Bathroom -> Bathtub //End
        storyConnections[16][24] = 2; // Bathroom -> Toilet  //End

//        storyConnections[25][26] = 1; // Front Door -> Kitchen
//        storyConnections[25][11] = 1; // Front Door -> Living Room //Cant connect Front door?
//
//        storyConnections[26][28] = 1; // Kitchen -> Attack //End
//        storyConnections[26][27] = 1; // Kitchen -> Wait //End

        storyConnections[13][23] = 1; // Closet -> Key
        storyConnections[13][32] = 2; // Closet -> Hide //End

        storyConnections[23][31] = 1; // Key -> Fast //End
        storyConnections[23][27] = 2; // Key -> Slow //End

        return storyConnections;
    }
    public String getFileNameForSegment(int segmentIndex) {
        String path = "Story/Story/";
        switch(segmentIndex) {
            case 0: return path + "Intro-Question1.txt";
            case 1: return path + "TowardHouse-Question2.txt";
            case 2: return path + "TowardForest.txt";
            case 3: return path + "OpenDoor-Question3.txt";
            case 4: return path + "Knock-Question4.txt";
            case 5: return path + "Hide.txt";
            case 6: return path + "RunToStairs.txt";
            case 7: return path + "StankFace-Ending2.txt";
            case 8: return path + "Smile-Question5.txt";
            case 9: return path + "BadFeeling-Ending3.txt";
            case 10: return path + "StayHopeful.txt";
            case 11: return path + "LivingRoom-Question8.txt";
            case 12: return path + "Closet-Question10.txt";
            case 13: return path + "UseFood-Question11.txt";
            case 14: return path + "MasterBedroom-Question14.txt";
            case 15: return path + "Master-Question15.txt";
            case 16: return path + "Bathroom-Question18.txt";
            case 17: return path + "LayOnBed-Ending9.txt";
            case 18: return path + "ExamineNightstand-Question16.txt";
            case 19: return path + "PlayDead-Ending12.txt";
            case 20: return path + "FindWeapon-Question17.txt";
            case 21: return path + "Scared-Ending10.txt";
            case 22: return path + "Brave-Ending11.txt";
            case 23: return path + "Toilet-Ending14.txt";
            case 24: return path + "StayInTheBathroom-Ending13.txt";
            case 25: return path + "TalkToThing.txt";
            case 26: return path + "Surroundings-Question7.txt";
            case 27: return path + "Slow-Ending6.txt";
            case 28: return path + "ExamineKey-Question12.txt";
            case 29: return path + "ExamineSink-Question19.txt";
            case 30: return path + "ExamineThing.txt";
            case 31: return path + "Fast-Ending5.txt";
            case 32: return path + "HideInCloset-Ending8.txt";
            case 33: return path + "HideUnderBed-Ending7.txt";
            case 34: return path + "HideUnderBed-Ending7.txt";
            default: return "Unknown segment";
        }
    }

    public String[] getStorySegments() {
        return storySegments;
    }

    private static String data(File file) {
        LoadData loadData = new LoadData();
        String[] parts = loadData.Data(file);
        return parts[0].trim() + "\n\n\n" + parts[1].trim() + "\n" + parts[2].trim() + "\n" + parts[3].trim();
    }
}
