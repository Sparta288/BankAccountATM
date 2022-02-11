import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();


        Scanner sc = new Scanner(System.in);


        char ch;

        System.out.println("Enter your first name: ");
        String f_name = sc.next();
        obj.setFirstName(f_name + " ");

        System.out.println("Enter your last name: ");
        String l_name = sc.next();
        obj.setLastName(l_name);

        System.out.println("Enter your account number: ");
        int a_num = sc.nextInt();
        obj.setAccountID(a_num);






        /* Interactive loop for deposit/withdraw money */
        do {


            /* call deposit  */
            System.out.print("Enter the money you want to deposit : ");
            double d_money = sc.nextDouble();
            obj.deposit(d_money);

            /* print the account summary */
            System.out.println(obj.AccountSummary());

            /* withdraw money  */
            System.out.print("Enter the money you want to withdraw : ");
            double w_money = sc.nextDouble();
            obj.processWithdraw(w_money);

            obj.displayAccount();

            System.out.print("\nDo you want deposit or withdraw more money from your account? (Y/N) : ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}



