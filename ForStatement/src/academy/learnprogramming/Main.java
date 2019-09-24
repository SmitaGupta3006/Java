package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        for(init; termination; increment){
              for(int i =0; i < 5; i++){
                  System.out.println("Loop " + i + " hello!");
            }
          for(int i = 0; i <= 8; i++){
              System.out.println("10,000 at " + i + "% interest = " +
                      String.format("%.2f", calculateInterest(10000, i)));
          }

        System.out.println("****************************");

        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
