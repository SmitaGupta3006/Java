public class NumberToWords {

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            int reversedNumber = reverse(number);
            int digitNumber = getDigitCount(number);
            int reverseDigitNumber = reverse(reversedNumber);

            if(reversedNumber == 0)
                System.out.println("Zero");

                while(reversedNumber != 0) {
                    switch (reversedNumber % 10) {
                        case 0: System.out.println("Zero"); break;
                        case 1: System.out.println("One"); break;
                        case 2: System.out.println("Two"); break;
                        case 3: System.out.println("Three"); break;
                        case 4: System.out.println("Four"); break;
                        case 5: System.out.println("Five"); break;
                        case 6: System.out.println("Six"); break;
                        case 7: System.out.println("Seven"); break;
                        case 8: System.out.println("Eight"); break;
                        case 9: System.out.println("Nine"); break;
                    }
                    reversedNumber /= 10;
                }
                if(digitNumber > reverseDigitNumber){
                    for(int i = 1; i <= (digitNumber - reverseDigitNumber); i++){
                        System.out.println("Zero");
                    }
                }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse += lastDigit;
            reverse *= 10;
            number = number / 10;
        }
        reverse = reverse / 10;
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }else if(number == 0) {
            return 1;
        }else{
            int count = 0;
            while(number != 0){
                number /= 10;
                count++;
            }
            return count;
        }
    }

}
