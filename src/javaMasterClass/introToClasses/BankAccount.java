package javaMasterClass.introToClasses;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber){
        System.out.println("Bank account constructor called with parameters");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        email = customerEmail;

    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this("98765", 3000.00, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){

        this.accountBalance = this.accountBalance + amount;

    }

    public void withdraw(double amount){

        if ((this.accountBalance - amount) < 0){
            System.out.println("Account balance too small for withdrawal amount");
            return;
        }
        this.accountBalance = this.accountBalance - amount;
    }
}
