//Bhudev Katawal 116237 BIT sec "P"

class BankAccount {

    private double balance;
    // Encapsulated field

    BankAccount(double balance) {

        this.balance = balance;
    }

    public void withdraw(double amt) {

        if(amt > 0 && amt <= balance) {
            // Prevent overdrawing

            balance -= amt;

            System.out.println(
                    "Withdrawn: " + amt);
        }

        else {

            System.out.println(
                    "Invalid transaction");
        }
    }

    public double getBalance() {

        return balance;
    }
}

public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount acc =
                new BankAccount(10000);

        acc.withdraw(2500);

        System.out.println(
                "Balance = " +
                acc.getBalance());
    }
}
