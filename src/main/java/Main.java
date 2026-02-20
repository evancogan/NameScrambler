//Name scrambler

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        String scrambled = scramble(firstName, lastName, new Random());
        System.out.println("Scrambled name: " + scrambled);

        scanner.close();
    }

    static String scramble(String firstName, String lastName, Random random) {
        String combined = firstName + lastName;
        char[] chars = combined.toCharArray();

        // Shuffle the characters using Fisher-Yates algorithm
        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }
}

