package Q_05;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();

        double Celsius = (5.0/9.0)*(Fahrenheit - 32);

        System.out.printf("Temperature in celsius: %.2f°C%n",Celsius);
        scanner.close();
    }
}
