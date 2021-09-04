package com.example.cst438_hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Login {
    static ArrayList<String> usernames = new ArrayList(Arrays.asList("Noah316","Sumagang427", "Rob538", "Germ649", "Erikito751"));
    static String password = "guhhh";

    public static boolean usernameVerification(String user){
        for (int i=0; i < usernames.size(); i++){
            if (user.equals(usernames.get(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean passwordVerification(String userpswrd){
        return userpswrd.equals(password);
    }
}
