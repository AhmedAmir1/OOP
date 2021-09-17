import java.util.*;

class Bank1 {
    int balance = 0;

    public void check() {
        System.out.println("Your current balance is " + balance);
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("You deposited Rs. "+amount);
        System.out.println("Your balance now Rs. "+balance);
        // return balance; 
    }

    public void withdraw(int amount) {
        if (amount>=100){
            balance = balance - amount;
            System.out.println("You withdraw Rs. "+amount);
            System.out.println("Your balance now Rs. "+balance);
        }
        else{
            System.out.println("amount must be atleast 100");
        }  
    }

}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a,b,c;
        Bank1 ahmed = new Bank1();
        while (true) {
            System.out.println("Enter 1 for check the balance, 2 for deposit, 3 for withdraw and other for exit ");
            
            
            a  = sc.nextInt();
            
            if (a==1){
                ahmed.check();
            }
            else if (a==2){
                System.out.print("Enter the amount you want to deposit: ");
                // Scanner i = new Scanner(System.in);
                b = sc.nextInt();
                ahmed.deposit(b);
                // System.out.println("You deposited Rs. "+ b);
            }
            else if (a==3){
                System.out.println("Enter the amount you want to withdraw: ");
                // Scanner j = new Scanner(System.in);
                c = sc.nextInt();
                ahmed.withdraw(c);
            }
            else{
                break;
            }
           // sc.close();
            // i.close();
            // j.close();

        }
      sc.close();

    }
    

}
