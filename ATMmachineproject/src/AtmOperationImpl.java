import java.util.*;
public class AtmOperationImpl implements AtmOperationInterface{
    ATM atm=new ATM();
    Map<Double,String> trans_history=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmt) {
        if(withdrawAmt%500==0){
            if(withdrawAmt<atm.getBalance()){
                trans_history.put(withdrawAmt," Amount Withdrawn ");
                System.out.println("Collect the cash "+withdrawAmt);
                atm.setBalance(atm.getBalance()-withdrawAmt);
                viewBalance();
            }
            else if(withdrawAmt<atm.getBalance()){
                System.out.println("Insufficient Balance !!");
            }
            else{
                System.out.println("Insufficient Balance !!");
            }
        }
       else{
            System.out.println("Please enter the amount in multiple of 500.");
        }
    }

    @Override
    public void depositAmount(double depositAmt) {
        trans_history.put(depositAmt," Amount Deposited ");
        System.out.println(depositAmt+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmt);
        viewBalance();
    }

    @Override
    public void viewTransactionHistory() {
        for(Map.Entry<Double,String> t: trans_history.entrySet()){
            System.out.println(t.getKey() + " " + t.getValue());
        }
    }

    public void transferAmount(double amount, int targetAccount) {
        if(amount<atm.getBalance()) {
            trans_history.put(amount, " Amount Transferred to Account " + targetAccount);
            System.out.println(amount + " Transferred Successfully to Account " + targetAccount);
            atm.setBalance(atm.getBalance() - amount);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
