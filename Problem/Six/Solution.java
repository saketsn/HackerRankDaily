package Problem.Six;

import java.util.Scanner;
import java.util.regex.*;

class MyRegex {
    // Regex to check the format A.B.C.D where A, B, C, and D are between 0 and 255
    String pattern = "^(0|[0-9]{1,3})\\.(0|[0-9]{1,3})\\.(0|[0-9]{1,3})\\.(0|[0-9]{1,3})$";
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        Pattern pattern = Pattern.compile(myRegex.pattern);

        while (scanner.hasNext()) {
            String ip = scanner.next();
            Matcher matcher = pattern.matcher(ip);

            if (matcher.matches() && isValidIP(matcher)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }


    private static boolean isValidIP(Matcher matcher) {
        for (int i = 1; i <= 4; i++) {
            int num = Integer.parseInt(matcher.group(i)); // Convert to integer
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }
}
