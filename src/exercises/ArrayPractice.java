package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        int [] intArray = {1, 1, 2, 3, 5, 8};
//
//        for (int i = 0; i < intArray.length; i++){
//            //System.out.println(intArray[i]);
//            if(intArray[i] % 2 != 0){
//                System.out.println(intArray[i]);
//            }
//        }
        String phrase= "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] words = phrase.split(" ");
        String [] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));

//        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = phrase.split(" ");
//        System.out.println(Arrays.toString(words));

    }
}
