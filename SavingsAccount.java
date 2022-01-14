//Savings Account

/* The following illustrates inheritance.
 * We take the encapsulating object BankAccount
 * and extend it to add special cases referring
 * to specific uses that only a SavingsAccount has
 */
public class SavingsAccount extends BankAccount{
    //attributes
    private double minBalance;
    private static double initialInterest = 2.5;

    public SavingsAccount(String accOwner, double accBalance, double minBalance){
        super(accOwner, accBalance);
        this.minBalance = minBalance;
    }

    public String getOwnerBalance(){
        return super.getOwnerBalance() + "," + minBalance + "," + initialInterest;
    }

    public double withdraw(double withdraw){
        if(withdraw <= accBalance - minBalance){
            accBalance = accBalance - withdraw;
            return accBalance;
        }
        else{
            return -1;
        }
    }

    public void applyInterest(){
        accBalance = accBalance + (accBalance * (initialInterest/100));
    }

}