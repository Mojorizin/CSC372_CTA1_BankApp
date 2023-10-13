public class Main {
    public static void main(String[] args) {

        //Testing everything
        CheckingAccount cAcct1 = new CheckingAccount("Jane", "Doe", 12345);
        cAcct1.deposit(25.25);
         cAcct1.withdrawl(10);
         cAcct1.accountSummary();
         cAcct1.processWithdrawl(5);
         cAcct1.processWithdrawl(50);
         cAcct1.displayAccount();
    }
}