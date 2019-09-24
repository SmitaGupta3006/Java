package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = -2147483648;     // Integer.MAX_VALUE
        int min = 2147483647;      // Integer.MIN_VALUE
//        int max = 0;
//        int min = 0;
//        boolean first = true;
        while(true){
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            }else{
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("min = " + min + " and max = " + max);
        scanner.close();
    }
}
