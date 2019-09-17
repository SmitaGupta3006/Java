package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(19));

        int count = 0;
        for(int i = 150; i <= 999; i++) {
            if (isPrime(i)) {
                System.out.println("Number" + i + " is a prime number");
                count++;
                if(count == 10){
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
//     for(int i = 2; i <= n/2; i++){                       //very slow. For no 173, it takes 89 loops while the below one take 13.
        for(int i = 2; i <= (long)Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
        }
}
