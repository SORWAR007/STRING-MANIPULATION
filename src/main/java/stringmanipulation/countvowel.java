package stringmanipulation;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class countvowel {
    public static void main(String[] args) {
        String str="my favourite is apple";
        String vowel="aeiou";
        char [] chars= str.toLowerCase().toCharArray();
        char [] vowelarray=vowel.toCharArray();
        int count=0;
        LinkedHashSet<Character> HAS=new LinkedHashSet<Character>();
        for(char c:chars)
        {
            for(char v:vowelarray)
            {
             if(c==v)
                 count++;

             HAS.add(v);

            }

        }
        System.out.println(count
        );
        System.out.println(HAS);
    }
}
