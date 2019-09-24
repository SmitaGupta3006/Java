package academy.learnprogramming;

import javax.swing.text.View;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();  //"12345", 0.00, "Bob Brown",
//                "myemail@bob.com", "(081) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhone("(081) 123-4567");


        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawl(100.0);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
