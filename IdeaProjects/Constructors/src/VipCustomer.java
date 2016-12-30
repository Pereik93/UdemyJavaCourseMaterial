/**
 * Created by perol on 02.06.2016.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 10_000.00, "Default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
