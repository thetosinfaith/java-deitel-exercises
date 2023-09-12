package Assignments;

import java.util.Scanner;
public class VelocityAcceleration {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter vo in meters/second: ");
        double vo = input.nextDouble();

                System.out.print("Enter v1 in meters/second: ");
        double v1 = input.nextDouble();

                System.out.print("Enter the timespan in seconds");
        double timespan = input.nextDouble();

double acceleration = (v1 - vo ) / timespan;
        System.out.println("The average acceleration is" + acceleration);
            }
        }





