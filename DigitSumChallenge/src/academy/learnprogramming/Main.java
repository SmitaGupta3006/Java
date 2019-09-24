package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;   // same as number /= 10;
        }

        return sum;
    }
}
