package stringmanipulation;

import java.util.Random;

public class generaterandompassword {
    public static void main(String[] args) {
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi" +
                "jklmnopqrstuvwxyz!@#$%&";
        char[] ch = str.toCharArray();
        Random random = new Random();
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 8; i++) {

            SB.append((ch[random.nextInt(str.length())]));
        }
        System.out.println(SB);

    }
}
