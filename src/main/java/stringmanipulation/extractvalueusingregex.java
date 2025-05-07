package stringmanipulation;

public class extractvalueusingregex {

    public static void main(String[] args) {

        String str= "the price of this shirt is 500 taka and vat is 75 taka";
      String str1=str.replaceAll("[^\\d]"," ");
        String st2= str1.trim();
        String st3=st2.replaceAll("  +"," ");
       String[] starray=st3.split( " ");
        int PRICE= Integer.parseInt((starray[0]));
       int vat= Integer.parseInt((starray[1]));
       int totalprice=PRICE + vat;
        System.out.println(totalprice);


    }
}
