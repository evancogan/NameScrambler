//Name scrambler

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        // Build combined name from both inputs
        StringBuilder combinedName = new StringBuilder();

        for (int i = 0; i < firstName.length(); i++) {
            combinedName.append(firstName.charAt(i));
        }

        for (int i = 0; i < lastName.length(); i++) {
            combinedName.append(lastName.charAt(i));
        }

        // Shuffle characters (Fisher-Yates)
        char[] chars = combinedName.toString().toCharArray();
        Random random = new Random();

        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        String scrambledName = new String(chars);
        System.out.println("Scrambled name: " + scrambledName);

        scanner.close();
    }
}

