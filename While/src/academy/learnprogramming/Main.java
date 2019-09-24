package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int count = 0;
	while(count != 6){
        System.out.println("Count value is " + count);
        count++;
    }
//	for(int i = 1; i != 6; i++){
//        System.out.println("Count value is " + i);
//    }
//        count = 1;
//        while(true){
//            if(count == 5){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        count = 1;
        do{
            System.out.println("Count value is " + count);
            count++;
        }while(count != 6);

//        int number = 4;
//        int finishNumber = 22;
//        while(number <= finishNumber){
//            number ++;
//            if(!isEvenNumber(number)){
//               continue;
//            }
//            System.out.println("Even Number " + number);
//        }
        int number = 4;
        int finishNumber = 22;
        int totalEvenNumbers = 0;
        while(number <= finishNumber){
            number ++;
            if(!isEvenNumber(number)){
                continue;
            }
            totalEvenNumbers++;
            System.out.println("Even Number " + number);
            if(totalEvenNumbers >= 5){
                break;
            }
        }
        System.out.println("Total Even Numbers = " + totalEvenNumbers);
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
