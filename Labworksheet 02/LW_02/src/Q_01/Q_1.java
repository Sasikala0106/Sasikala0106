package Q_01;

import java.lang.Math;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter value for B: ");
        double B = scanner.nextDouble();

        System.out.print("Enter value for C: ");
        double C = scanner.nextDouble();

        double resultA;
        resultA = Math.sqrt(Math.pow(B,2) + 4 * A * C);
        System.out.print("square root of B^2 + 4AC: " + resultA);

        System.out.print("\nEnter value for X: ");
        double X = scanner.nextDouble();

        System.out.print("Enter value for Y: ");
        double Y = scanner.nextDouble();

        double resultB;
        resultB = Math.sqrt(X + 4 * Math.pow(Y,3));
        System.out.print("\nSquare root of X + 4Y^3: " + resultB);

        double resultC;
        resultC = Math.cbrt(X*Y);
        System.out.print("\nCube root of(X*Y): " + resultC);

        System.out.print("\nEnter value for radius: ");
        double radius = scanner.nextDouble();

        double area=Math.PI * Math.pow(radius,2);
        System.out.print("\nArea of a circle: "+area);

       scanner.close();
    }
}
