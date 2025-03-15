package Q_07;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.printf("Enter your height in cm: ");
        double height = scanner.nextDouble();

        double BMI = weight/ Math.pow(height / 100.0,2);

        System.out.printf("Your BMI is: %.2f%n", BMI);

        scanner.close();

    }
}
