package Q_03;

import javax.swing.*;
import java.util.Scanner;

    public class Main3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first name");
            String firstName = input.next();

            System.out.print("Enter middle name");
            String middleName = input.next();

            System.out.print("Enter last name");
            String lastName = input.next();

            String midInitial = middleName.substring(0, 1) + ".";

            input.close();

            System.out.println("Formatted Name:" + firstName + " " + midInitial  + lastName + ".");
        }
    }


