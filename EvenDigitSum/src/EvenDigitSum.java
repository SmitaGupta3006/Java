public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int lastDigit = number % 10;
            number /= 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
        }
        return sum;
    }
    }
//        if(number < 0){
//            return -1;
//        }
//        int sum = 0;
//        int lastDigit = 0;
//        while(number > 0){
//            lastDigit = number % 100;
//            lastDigit /= 10;
//            sum += lastDigit;
//            number = number / 100;
//        }
//        return sum;
