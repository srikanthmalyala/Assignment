import java.math.BigDecimal;

/**
 * Created by srikanth on 15/09/12.
 */
public class Account implements Comparable {

    private int accountNumber;
    private int usage;
    private double cost;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    @Override
    public int compareTo(Object o) {
        Account account = (Account) o;
        if (this.getCost() > account.getCost()) {
            return 1;
        } else {
            if (this.getCost() < account.getCost()) {
                return -1;
            }
            return 0;
        }
    }
}
