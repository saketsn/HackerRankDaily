package Problem.two;

import java.util.Scanner;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String line = scanner.nextLine();
            boolean found = false;

            Pattern pattern = Pattern.compile("<([^<>/]+)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        scanner.close();
    }
}

