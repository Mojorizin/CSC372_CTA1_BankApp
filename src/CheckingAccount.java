public class CheckingAccount extends BankAccount {
    // Sets interest rate for the account to 3%.
    double interestRate = 0.03;

    // Constructor that extends the superclass Bank Account.
    public CheckingAccount(String firstName, String lastName, int accountID) {
        super(firstName, lastName, accountID);
    }
    public double processWithdrawl(double withdrawAmount) {
        /*
         * Withdraws a specified amount (passed as an argument) from the account.
         * If the account balance is negative, $30 late fee is added and negative balance is displayed.
         * If the account balance is positive, displays the balance.
         */
        System.out.print("\n--------------Withdraw----------------------");
        System.out.printf("\nYour current balance is: $%.2f\nYour withdraw amount is: $%.2f", getBalance(), withdrawAmount);

        if (getBalance() - withdrawAmount < 0) {
            setBalance((getBalance() - withdrawAmount - 30));
            System.out.print("\nYour account has a negative balance and has been assessed a $30 fee.");
            System.out.printf("\nYour new balance is: $%.2f. Please make a deposit.", getBalance());
            System.out.print("\n-------------------------------------------");
        }
        else {
            setBalance ((getBalance() - withdrawAmount));
            System.out.printf("\nYour new balance is: $%.2f", getBalance());
            System.out.println("\n--------------------------------------------");
        }
        return getBalance();
    }
    public void displayAccount() {
        /*
         * Prints out the info from the super by calling the account Summary method.
         * Adds another line to show the interest rate on the checking account.
         */
        accountSummary();
        System.out.printf("\nAccount interest rate is: " + (interestRate * 100) + "%%");
    }
}
