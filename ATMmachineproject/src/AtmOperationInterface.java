import java.util.*;
public interface AtmOperationInterface {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmt);
    public void depositAmount(double depositAmt);
    public void viewTransactionHistory();

    public void transferAmount(double amount, int targetAccount);
}
