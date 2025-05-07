package stringmanipulation;

import java.util.HashMap;

public class frequencyofstring {
    public static void main(String[] args) {

        String st="racecar";
        char [] ch= st.toCharArray();
        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char c: ch)
        {
            hashmap.put(c,hashmap.getOrDefault(c,0)+1);
        }
        System.out.println(hashmap);
    }
}
