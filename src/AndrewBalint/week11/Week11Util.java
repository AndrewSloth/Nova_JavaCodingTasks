package AndrewBalint.week11;

import java.util.HashMap;
import java.util.Map;

public class Week11Util {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 83812);
        map.put(2, 12);
        map.put(3, -8812);
        map.put(4, 0);
        map.put(5, 82);
        map.put(6, -81222);

        System.out.println(mapMinValue(map));

        HashMap<Integer, String> stringMap = new HashMap<>();

        stringMap.put(1, "Loser");
        stringMap.put(2, "Chim chim");
        stringMap.put(3, "Slurp");
        stringMap.put(4, "elephant");
        stringMap.put(5, "sagittarius");
        stringMap.put(6, "scorpio");

        System.out.println(mapFreqOfString(stringMap, 5,'a'));

    }


    /*
    Map - Frequency of Characters
    Write a method that prints the frequency of each character from a String
    */

    public static int mapFreqOfString(Map<Integer, String> map, Integer key, char c){
        String string = map.get(key); //get the string in question from the map
        int freqOfChar = 0; //set a count variable
        
        //go through the string and count the character's frequency
        for(int i= 0; i<string.length();i++){
            if(string.charAt(i)==c){
                freqOfChar++;
            }
        }
        
        return freqOfChar;//return the final count
        
    }


        /*
    Map - Min value
    Write a method that can return the minimum value from ta map (DO NOT use sort method)
    */
    public static Integer mapMinValue(Map<Integer, Integer> map){

        if(map.isEmpty()){
            System.err.println("Map is empty and has no minimum value");
            System.exit(1);
        }

        Integer minValue = Integer.MAX_VALUE;

        for(int i = 1; i<= map.size();i++){
            if(map.get(i)<minValue){
                minValue=map.get(i);
            }
        }

        return minValue;
    }



}
