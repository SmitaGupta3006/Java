public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int actualNumber = number;
        int reverse = 0;
            while(number != 0){
                int digit = number % 10;
                number = number / 10;
                reverse += digit;
                reverse *= 10;
            }
            reverse /= 10;
            if(reverse == actualNumber){
               return true;
            }
            return false;
    }
}
