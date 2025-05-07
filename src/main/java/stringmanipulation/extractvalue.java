package stringmanipulation;

public class extractvalue {
    public static void main(String[] args) {
        String st="bangladesh";
        char [] ch=st.toCharArray();
        String firstword=String.valueOf(st.charAt(0));
        String lastword=String.valueOf(st.charAt(9));
        String words= st.substring(1,9);
        int words1=words.length();
        String full= firstword+words1+lastword;
        System.out.println(full);

    }
}
