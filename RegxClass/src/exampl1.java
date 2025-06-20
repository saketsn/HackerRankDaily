package Regx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exampl1 {

    public void checkStringAginsRE(String re, String str){

        Pattern patterns = Pattern.compile(re);
        Matcher matcher = patterns.matcher(str);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regular expression");
        String re = sc.nextLine();
        System.out.println("Enter your string");
        String str = sc.nextLine();

        

    }
}
