public class BankAccount {
    private final String accountNumber;
    private int pin;
    private double balanceCad;

    // Magic number
    public static final double USD_TO_CAD_XCH = 1.27;
    public static final double DEFAULT_WD_CAD = 20.00;

    public BankAccount(final String accountNumber, final int pin, final double balanceCad) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balanceCad = balanceCad;
    }

    /**
     * withdraws DEFAULT_WD_CAD
     */
    public void withdraw() {
        this.balanceCad -= DEFAULT_WD_CAD;
    }

    public void withdraw(final double amountCad, final String lastName) {
        // check last name
    }

    public void withdraw(final double amountCad, final String accountNumber) {
        if(this.accountNumber.equalsIgnoreCase(accountNumber)) {
            balanceCad -= amountCad;
        }
    }

    public void withdraw(final String accountNumber, final double amountCad) {
        if(this.accountNumber.equalsIgnoreCase(accountNumber)) {
            balanceCad -= amountCad;
        }
    }

    public void withdraw(final int amountUsd) {
        balanceCad -= amountUsd * USD_TO_CAD_XCH;
    }

    public void withdraw(final double amountCad) {
        balanceCad -= amountCad;
    }

    public void withdraw(final double amountCad, final int pin) {
        if(this.pin == pin) {
            balanceCad -= amountCad;
        }
    }

    public static void main(final String[] args) {
        BankAccount b = new BankAccount();
        b.withdraw(400);
        b.withdraw("abc", 400);
    }
}
