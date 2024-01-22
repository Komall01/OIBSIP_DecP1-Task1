import java.util.*;

public class Main {
    public static void main(String[] args) {

        AtmOperationInterface op=new AtmOperationImpl() ;
        int atmnumber=12345;
        int atmPin=123;
        int new_atmNumber=1111;
        int new_atmPin=11;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM MAchine !");
        System.out.print("Enter ATM Number : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin : ");
        int pin=in.nextInt();

        if((atmnumber==atmNumber) && (atmPin==pin) || (atmNumber==new_atmNumber) && (pin==new_atmPin)){
            while (true) {
//                System.out.println("Validation Done");
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Transaction History\n5.Transfer\n6.Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmt=in.nextDouble();
                    op.withdrawAmount(withdrawAmt);
                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmt=in.nextDouble();
                    op.depositAmount(depositAmt);
                }
                else if(ch==4){
                    op.viewTransactionHistory();
                }
                else if(ch==5){
                    System.out.println("Enter the ATM number of account to with amount is to be transferred");
                    int acc_Number=in.nextInt();
                    System.out.println("Enter the amount to be transferred : ");
                    double amt=in.nextInt();
                    op.transferAmount(amt,acc_Number);
                }
                else if(ch==6){
                    System.out.println("Collect Your ATM Card\nThank You for using ATM Machine!!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter Correct Choice");
                }

            }

        }
        else{
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }
    }
}