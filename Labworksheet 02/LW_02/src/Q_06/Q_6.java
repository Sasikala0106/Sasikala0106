package Q_06;

import java.time.Year;
import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int currentYear = Year.now().getValue();
        System.out.print("Enter your born year: ");
        int birthYear = scanner.nextInt();

        int age = currentYear - birthYear;

        System.out.printf("You were born in %d and will be (are) %d this year.%n ",birthYear,age);
    }
}
