package Q_02;

import java.util.Scanner;

public class Q_2 {
       public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter the length in centimeters: ");
           double cm=scanner.nextDouble();

           double inches = cm /2.54;
           int feet = (int)(inches/12);
           double remainingInches = inches % 12;

           System.out.printf("%.2f cm is approximately %d feet and %.2f inches.%n" , cm,feet,remainingInches);

           scanner.close();

       }
}
