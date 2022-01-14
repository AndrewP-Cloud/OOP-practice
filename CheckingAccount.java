//CheckingAccount

/* The following illustrates polymorphism as the
 * withdraw method has now been altered from the 
 * original BankAccount.withdraw to one that includes
 * a CheckingAccount's transaction fees
 */

public class CheckingAccount extends BankAccount{
    //attributes
    private double transactionFees;

    public CheckingAccount(String accOwner, double accBalance){
        super(accOwner, accBalance);
        transactionFees = 0;
    }

    public String getOwnerBalance(){
        return super.getOwnerBalance() + "," + transactionFees;
    }

    public double withdraw(double withdraw){
        if(withdraw <= accBalance){
            accBalance = accBalance - withdraw;
            transactionFees = transactionFees + 2;
            return accBalance;
        }
        else{
            return -1;
        }

    }
}
