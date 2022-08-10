package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(12);
        nums.add(14);
        nums.add(16);
        nums.add(18);
        nums.add(20);


    }

    public static void printFivers(ArrayList<String> words) {
        ArrayList<String> fivers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for(String word : words){
            if(word.length() == numChars){
                fivers.add(word);
            }
        }
        System.out.println(fivers);
    }
}
