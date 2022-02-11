

    public class CheckingAccount extends BankAccount{

        public CheckingAccount(String firstName, String lastName, int accountID, double balance) {
            super(firstName, lastName, accountID, balance);
        }

        public CheckingAccount() {
            super();
        }


        public void processWithdraw(double amount){
            withdrawal(amount);


           if (getBalance() < 0) {
               withdrawal(30);
               System.out.println("Balance: " + getBalance());
               System.out.println("\nFee has been accessed.\n");
           }

        }

        public void displayAccount(){
            System.out.println("Account summary after interest rate: ");
            AccountSummary();
            double interestRate = 5;
            System.out.println("Interest rate: " + interestRate + "%");

        }

    }
