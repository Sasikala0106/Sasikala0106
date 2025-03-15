package Q_08;

import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of radius: ");
        double radius = scanner.nextDouble();

        double Volume = (4.0/3.0)*(Math.PI * Math.pow(radius,3));

        System.out.printf("The volume of the sphere is: %.2f%n",Volume);

        scanner.close();
    }
}
