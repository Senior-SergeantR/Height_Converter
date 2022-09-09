import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Height {

    public static void main(String[] args) {

        System.out.println(" This program involves the conversion of height from feet and inches to meters and centimeters: ");
        Scanner scan= new Scanner(System.in);

        /**
         * this program involves conversion of height from one SI unit to another
         * that is from feet and inches to metres and centimeters
         */
        System.out.println("Please Enter your height in Feet: ");

        int n = scan.nextInt();

        System.out.println("Please Enter your height in Inches: ");
        

        int a = scan.nextInt();
        /**
         * this is the conversion of height from feet to meters
         */

        double b = n*30.48;
        System.out.println("Your Height from feet to Centimetres: " +b);

        /**
         * conversion of height from inches to centimeters
         */

        double c = a*2.54;
        System.out.println("Your Height from inches to Centimeters: " +c);

        /**
         * your height in  metres and centimeters
         */

        double d = (b+c)/100;

        System.out.println("Your height in metres is: " +d);

        System.out.println("-------------------------------------------------------------------------------------------------------------");



        System.out.println(" This program makes calculations related to your height."
        +   "\n Type 1 to give your height in Feet and Inches or"
        + "\n Type 2 to give your height in centimeters. ");

        int unit_selection = scan.nextInt();


        if ( unit_selection == 1){
        //here we can make calculations already done in the previous exercise
            int feet;
            int inches;

            System.out.println("Enter your height in feet: ");

            feet = scan.nextInt();

            System.out.println( " Enter your height in inches:");

            inches = scan.nextInt();
            double mm= feet*30.48;
            double in= inches* 2.54;
            double meters= (mm + in)/100;

            System.out.println(" Your height is " +meters + " Metres");

/**
 * converting meters and centimetres to feet and inches but specificly inches
 *
 */

        }
        else  if ( unit_selection == 2){

            int meters;
            int centimetres;

            System.out.println("Enter your height in metres: ");

            meters = scan.nextInt();

            System.out.println( " Enter your height in centimeters:");

            centimetres = scan.nextInt();

            double mt= meters * 30.48 / 100;
            double cm= centimetres * 2.54;
            double feet= (mt + cm);

            System.out.println(" Your height is " +feet + " Feet Tall");

        }
       // else ( unit_selection <1; >2) {
            System.out.println("Wrong unit selection.!!!!");



        }




    }

