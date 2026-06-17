//Bhudev Katawal
class BankAccount {//12

    private double accountBalance;
    // Hidden from outside

    public void setBalance(double accountBalance) {

        this.accountBalance =
                accountBalance;
        // this refers to current object
    }

    public double getBalance() {
        return accountBalance;
    }
}

class zMain {

    public static void main(String[] args) {

        BankAccount acc =
                new BankAccount();

        acc.setBalance(50000);

        System.out.println(
                "Balance = " +
                        acc.getBalance());
    }
}
