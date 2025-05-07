package stringmanipulation;

public class captalizedfirstcharc {

    public static void main(String[] args) {
        String str="rahim lives in chattogram";
       String [] words=str.split(" ");
        for (int i = 0; i < words.length ; i++)
        {
          String firstchar=String.valueOf( words[i].charAt(0)).toUpperCase();
            String secchar=words[i].substring(1);
            String full= firstchar + secchar;
            System.out.println(full);
        }

    }
}
