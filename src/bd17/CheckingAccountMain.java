package bd17;

public class CheckingAccountMain {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount((int) (Math.random() * 1000));

        checkingAccount.changeAmount(-checkingAccount.getAmount());

        System.out.println(checkingAccount.getAmount());
    }
}
