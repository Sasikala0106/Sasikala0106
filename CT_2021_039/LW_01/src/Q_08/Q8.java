package Q_08;

import java.util.Scanner;
public class Q8 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string with an exclamation mark (!):");
            String input = scanner.nextLine();

            int exclamationIndex = input.indexOf('!');


            if (exclamationIndex != -1) {

                String beforeExclamation = input.substring(0, exclamationIndex).trim();

                String afterExclamation = input.substring(exclamationIndex + 1).trim();

                System.out.println(beforeExclamation);
                System.out.println(afterExclamation);
            } else {

                System.out.println("No exclamation mark found in the input string.");
            }


            scanner.close();
        }
    }


