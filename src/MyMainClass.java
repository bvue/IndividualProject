/**
 * Created by Bao on 2/8/2016.
 */
public class MyMainClass {

    public static void main(String[] args) {
        BankAccount entryOne = new BankAccount();

        entryOne.setAccount("Savings");
        entryOne.setBalance(100);
        entryOne.deposit(500);

        System.out.println(entryOne);
    }

}
