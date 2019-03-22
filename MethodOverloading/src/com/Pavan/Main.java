package com.Pavan;

public class Main {

    public static void main(String[] args) {
	// write your code here
      double num =  calcFeetAndInchesToCentimeters(2,5);
        double num2= calcFeetAndInchesToCentimeters(-10,3);
        double num3 = calcFeetAndInchesToCentimeters(4,0);
        double num4 = calcFeetAndInchesToCentimeters(14,0);
         double num5 = calcFeetAndInchesToCentimeters(11);
        double num6 = calcFeetAndInchesToCentimeters(0);
        double  num7 = calcFeetAndInchesToCentimeters(12);
        System.out.println("One " +num);
        System.out.println("Two "+num2);
        System.out.println("Three " +num3);
        System.out.println("Four "+num4);
        System.out.println("Five "+num5);
        System.out.println("Six "+num6);
        System.out.println("Seven "+num7);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid values");
            return -1;
        }
            double centimeters = (feet * 12) * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
       return centimeters ;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0 || inches > 12) {
            System.out.println("Invalid values");
            return -1;
        }
            double inchConversion = inches * 2.54;
            System.out.println("Converted inches centimeters " + inchConversion );

        return inchConversion;
    }


}
