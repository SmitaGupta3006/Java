package academy.learnprogramming;

   public class Account {
        private String number;
        private double balance;
        private String customerName;
        private String email;
        private String phone;

        public Account(){
            this("56789", 2.50, "Default Name",
                    "Default Address", "Default Phone");
            System.out.println("Empty constructor called");
        }

        public Account(String number, double balance, String customerName,
                       String email, String phone){
            System.out.println("Account constructor with parameter is called.");
            this.number = number;
            this.balance = balance;
            this.customerName =  customerName;
            this.email = email;
            this.phone = phone;
        }

        public void deposit(double depositAmount){
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + " made. New Balance is " +this.balance) ;
        }

        public void withdrawl(double withdrawlAmount) {
            if (balance - withdrawlAmount < 0) {
                System.out.println("Only " + this.balance + " is available. No withdrawl possible.");
            } else {
                this.balance -= withdrawlAmount;
                System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining Balance = "
                        + this.balance);
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }


