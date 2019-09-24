public class Rough {
        // write your code here
        public static void numberToWords (int number){
            if(number < 0)
                System.out.println("Invalid Value");
            else{
                int reversedN = reverse(number);
                int digitN = getDigitCount(number);
                int digitRN = getDigitCount(reversedN);
                if(reversedN == 0)
                    System.out.println("Zero");
                while(reversedN != 0){
                    switch(reversedN % 10){
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
                    reversedN /= 10;
                }
                if(digitN > digitRN){
                    for(int i=1; i<= (digitN - digitRN); i++)
                        System.out.println("Zero");
                }
            }
        }

        public static int reverse (int number){
            int reversedNumber = 0;
            while(number != 0){
                reversedNumber *= 10;
                reversedNumber += number % 10;
                number /= 10;
            }
            return reversedNumber;
        }

        public static int getDigitCount(int number){
            if (number < 0)
                return -1;
            else if(number == 0)
                return 1;
            else{
                int count = 0;
                while(number !=0){
                    number /= 10;
                    count ++;
                }
                return count;
            }
        }
    }