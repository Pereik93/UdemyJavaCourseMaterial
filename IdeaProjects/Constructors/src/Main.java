/**
 * Created by perol on 02.06.2016.
 */
public class Main {

    public static void main(String[] args){


        BankAccount peroAccount = new BankAccount(); //"34590", 0.00, "Per O", "peromail@mail.com", "33994400");
        System.out.println(peroAccount.getAcccountNumber());
        System.out.println(peroAccount.getBalance());

        peroAccount.setBalance(10_000);
        //System.out.println("Account balance: " + bankAccount.getBalance());
        peroAccount.withdrawFund(5_000);
        //System.out.println("Account balance: " + bankAccount.getBalance());
        peroAccount.withdrawFund(10_000);
        //System.out.println("Account balance: " + bankAccount.getBalance());
        peroAccount.deposit(1337);

        peroAccount.withdrawFund(6337);
        //System.out.println("balance is: " + peroAccount.getBalance());
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getAcccountNumber() + " name " +timsAccount.getCustomerName());


//        VipCustomer pero = new VipCustomer();
//        System.out.println(pero.getName());
//
//        VipCustomer pero2 = new VipCustomer("Bob", 25_000.00);
//        System.out.println(pero2.getCreditLimit());
//
//        VipCustomer pero3 = new VipCustomer("Tim", 50_000.00, "tim@email.com");
//        System.out.println(pero3.getName());
    }
}
