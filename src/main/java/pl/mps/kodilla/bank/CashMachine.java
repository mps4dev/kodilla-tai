package pl.mps.kodilla.bank;

public class CashMachine {

    private double[] transactions = new double[0];

    public void addTransactions(double[] transactions) {
        if (transactions == null) {
            return;
        }
        double[] newTab = new double[this.transactions.length + transactions.length];
        System.arraycopy(this.transactions, 0, newTab, 0, this.transactions.length);
        System.arraycopy(transactions, 0, newTab, this.transactions.length, transactions.length);
        this.transactions = newTab;
    }

    public int transactionsCount() {
        return transactions.length;
    }

    public double balance() {
        double sum = 0;
        for (double transaction : transactions) {
            sum = sum + transaction;
        }
        return sum;
    }

    public int paymentsCount() {
        int count = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }

    public int withdrawalsCount() {
        int count = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                count++;
            }
        }
        return count;
    }

    public double payments() {
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                sum = sum + transaction;
            }
        }
        return sum;
    }

    public double withdrawals() {
        double sum = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                sum = sum + transaction;
            }
        }
        return - sum;
    }
}
