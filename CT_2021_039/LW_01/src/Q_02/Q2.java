package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q2 {

        public static void main(String[] args){
            Scanner input =new Scanner(System.in);

            System.out.print("Enter first name");
            String firstName=input.next();

            System.out.print("Enter last name");
            String lastName=input.next();

            input.close();

            JFrame welcomeFrame;
            welcomeFrame=new JFrame();
            welcomeFrame.setSize(800,600);
            welcomeFrame.setTitle(firstName+" "+lastName);
            welcomeFrame.setVisible(true);

        }

    }


