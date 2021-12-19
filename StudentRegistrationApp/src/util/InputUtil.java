package util;

import java.util.Scanner;

public class InputUtil {

    public static String requireText(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        String answer = scanner.next();
        return answer;
    }

    public static int requireNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        int answer = scanner.nextInt();
        return answer;
    }
}
