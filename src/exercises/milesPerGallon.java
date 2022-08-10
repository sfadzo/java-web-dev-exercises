package exercises;
import java.util.Scanner;

public class milesPerGallon {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your distance driven in miles");
            Double disDriven = input.nextDouble();
            System.out.println("Please enter fuel used in gallons");
            Double gasUsed = input.nextDouble();
            Double milPerGal = disDriven/gasUsed;

            System.out.println("Your fuel efficiency is " + milPerGal + "mgp");

        }


}