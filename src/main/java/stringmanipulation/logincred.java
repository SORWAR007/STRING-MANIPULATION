package stringmanipulation;

import java.util.Scanner;

public class logincred {
    public static void main(String[] args) {


        String _usermname = "admin";
        String _password = "password";

        Scanner sc= new Scanner(System.in);
        System.out.println("input the user username");
        String username= sc.nextLine();
        System.out.println("input the user password");
        String password=sc.nextLine();
        if(username.equals(_usermname)&&(password.equals(_password)))
        {
            System.out.println("login successfull");

        }

   else
   {
            System.out.println("login failed");
   }


    }


}
