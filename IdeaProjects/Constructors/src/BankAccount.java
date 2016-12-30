/**
 * Created by perol on 02.06.2016.
 */
public class BankAccount {

    private String acccountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public BankAccount(String acccountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.acccountNumber = acccountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void setAcccountNumber(String acccountNumber){
        this.acccountNumber = acccountNumber;
    }
    public String getAcccountNumber(){
        return acccountNumber;
    }
    public void setBalance(int balance){
        if(balance < 0){
            System.out.println("Balance can not be less than 0");
        } else{
            System.out.println("Account balance: " + balance);
            this.balance = balance;
        }
    }
    public double getBalance(){
        System.out.println("Account balance: " + balance);
        return balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }


    public void deposit(int depositAmount){
        if(depositAmount < 0){
            System.out.println("Balance can not be less than zero");
        } else {
            this.balance = this.balance + depositAmount;
            System.out.println("Successfully inserted " + depositAmount);
            System.out.println("Total balance " + this.balance);
        }
    }

    public void withdrawFund (double widthdraw){
        if (this.balance < widthdraw){
            System.out.println("Not enough money");
        } else {
            this.balance = this.balance - widthdraw;
            System.out.println("Account balance after withdraw: " + this.balance);
        }
    }
}

