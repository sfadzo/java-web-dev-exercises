package exercises;
import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a rectangle");
        Double recLength = input.nextDouble();
        System.out.println("Please enter the width of a rectangle");
        Double recWidth = input.nextDouble();
        Double arOfRec = recLength * recWidth;
        System.out.println("The area of your rectangle is " + arOfRec);

    }
}
