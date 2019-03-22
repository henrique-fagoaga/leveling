public class BankAccount {
    private String bank;
    private String type;
    private float balance;

    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void displaySummary() {
        System.out.printf("Bank: %s | Type: %s | Balance: %f", this.bank, this.type, this.balance);
    }

    public void checkHasBalance() {
        if (this.balance < 0.0) {
            System.out.println("Have something in, may be active");
        } else {
            System.out.println("Inactive");
        }
    }

    public void isActive() {
        System.out.println("It's active!");
    }
}
