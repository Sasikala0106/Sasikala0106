package Q_10;

import java.util.Scanner;
public class Q10 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter an odd-length word:");
            String input = scanner.nextLine();

            if (input.length() % 2 != 0) {

                int middleIndex = input.length() / 2;

                System.out.println("The middle character is: " + input.charAt(middleIndex));
            } else {

                System.out.println("Please enter a word with an odd number of characters.");
            }

            scanner.close();
        }
    }


