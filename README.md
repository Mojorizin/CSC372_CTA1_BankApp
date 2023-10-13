# CSC372_CTA1_BankApp Assignment Instructions.

Part 1: Implement a superclass BankAccount that has the following fields and methods.

Fields:

string firstName
string lastName
int accountID
double balance
Methods:  

constructor():  initialize balance to zero
deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
Setters and getters for firstName, lastName, and accountID
getBalance() getter to return the balance
accountSummary() - prints all account information
Part 2: Implement a CheckingAccount class that inherits from the BankAccount class, that: 

Has an interest rate attribute
Allows overdraft withdrawals and charges a $30 fee
Methods:

processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed
displayAccount() - should display all superclass attributes and provides an additional interest rate
