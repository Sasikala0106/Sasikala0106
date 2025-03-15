package Q_04;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the your weight in pounds: ");
        double bodyWeight = scanner.nextDouble();

        double caloriesNedeed = bodyWeight * 19;

        System.out.printf("You need approximately %.2f calories per day.%n",caloriesNedeed);

        scanner.close();

    }
}
