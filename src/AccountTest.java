        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Collections;

        /**
 * Created by srikanth on 15/09/12.
 */
public class AccountTest {

    static final int N = 3;
    static final int givenUsage = 10;
    static ArrayList<Account> accounts = new ArrayList<Account>();
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static double maxCost =0f;
    static double maxUsage =0f;

    public static void main(String[] args) throws IOException {

        for (int i=0; i < N ; i++) {

            Account account = new Account();
            accounts.add(account);

            readAccountNumber(account);
            readInternetUsage(account);

            Double cost = account.getUsage() * 2.0;
            account.setCost(cost);

            if(maxCost < account.getCost()) {
                maxCost = account.getCost();
            }

            if(maxUsage < account.getUsage()) {
                maxUsage = account.getUsage();
            }
        }
        // Max usage
        System.out.println("Max usage " + maxUsage);
        System.out.println("Max Cost" + maxCost);

        //Display all account numberes which has more than 10GB
        for(Account account : accounts) {
            if(account.getUsage() > 10) {
                System.out.println("Account Number usage more than 10GB ::" + account.getAccountNumber());
            }
        }

        //Display all account numberes which has more than 10GB
        for(Account account : accounts) {
            if(account.getUsage() == 10) {
                System.out.println("Account with Given usage" + account.getAccountNumber());
            }
        }


        //Display all costs in ascending order
        Collections.sort(accounts);

        for(Account account : accounts) {
            System.out.println(account.getCost());
        }
    }

    public static void readAccountNumber(Account account) throws IOException {

        System.out.println("Enter Account Number...");
        int accountNumber = Integer.parseInt(bufferedReader.readLine());
        if (accountNumber < 1111 || accountNumber > 8888) {
            readAccountNumber(account);
        }
        account.setAccountNumber(accountNumber);
    }

    public static void readInternetUsage(Account account) throws IOException {

        System.out.println("Enter Internet usage...");
        int internetUsage = Integer.parseInt(bufferedReader.readLine());
        if (internetUsage < 5 || internetUsage > 1000) {
            readAccountNumber(account);
        }
        account.setUsage(internetUsage);
    }

}

