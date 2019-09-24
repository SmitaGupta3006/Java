public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number >= 0){
            int lastDigit = number % 10;
           while(number > 9){
               number = number / 10;
           }
           int sum = lastDigit + number;
           return sum;
        }
        return -1;
    }
}
