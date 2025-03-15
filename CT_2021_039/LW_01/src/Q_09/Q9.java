package Q_09;


import java.util.Scanner;
public class Q9 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            if (input.length() > 0) {

                System.out.println(input.length());

                System.out.println(input.charAt(0));

                System.out.println(input.charAt(input.length() - 1));
            } else {

                System.out.println("The string is empty.");
            }

            scanner.close();
        }
    }


