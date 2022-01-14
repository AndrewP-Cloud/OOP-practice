//Base BankObject

/*The following illustrates encapsulation as the methods 
 * and private attributes for the bank account are stored in
 * one object that contains the uses and data the bank account
 */
public abstract class BankAccount{
    //attributes
    private String accOwner;
    protected double accBalance;
 
    public BankAccount(
      String accOwner, 
      double accBalance
    ){
        this.accOwner = accOwner;
        this.accBalance = accBalance;
    }
    //Bank Account Constructor
    public BankAccount(
    ){
    }

    public String getOwnerBalance(
    ){
        return accOwner + "," + accBalance;
    }

    public double makeDeposit(
      double deposit
    ){
        accBalance = accBalance + deposit;
        return accBalance;
    }

    public double withdraw(
      double withdraw
    ){
        accBalance = accBalance - withdraw;
        return accBalance;
    }    
}