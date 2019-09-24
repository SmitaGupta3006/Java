package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        System.out.println("Array is: " + Arrays.toString(returnedArray));
        reverseArray(returnedArray);
        System.out.println("Reverse Array is: " + Arrays.toString(returnedArray));
    }

    private static int[] readIntegers(int count){
        int array[] = new int[count];

        for(int i=0; i<array.length; i++){
            System.out.println("Enter a Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static void reverseArray(int[] array){

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length-1-i] = temp;
        }
    }
}
