package timchuoitangdancododailonnhat;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) > result.charAt(result.length() - 1)) {
                result.append(input.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}

