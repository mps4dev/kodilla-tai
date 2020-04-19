package pl.mps.kodilla.bank;

public class Bank {

    private CashMachine[] cashMachines = new CashMachine[0];

    public void addCashMachines(CashMachine[] cashMachines) {
        if (cashMachines == null) {
            return;
        }
        CashMachine[] newTab = new CashMachine[this.cashMachines.length + cashMachines.length];
        System.arraycopy(this.cashMachines, 0, newTab, 0, this.cashMachines.length);
        System.arraycopy(cashMachines, 0, newTab, this.cashMachines.length, cashMachines.length);
        this.cashMachines = newTab;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public double balance() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.balance();
        }
        return sum;
    }

    public int paymentsCount() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                sum += cashMachine.paymentsCount();
            }
        }
        return sum;
    }

    public int withdrawalsCount() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                sum = sum + cashMachine.withdrawalsCount();
            }
        }
        return sum;
    }

    private double payments() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                sum += cashMachine.payments();
            }
        }
        return sum;
    }

    private double withdrawals() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                sum += cashMachine.withdrawals();
            }
        }
        return sum;
    }

    public double averagePayment() {
        if (paymentsCount() > 0) {
            return payments() / paymentsCount();
        } else {
            return 0;
        }
    }

    public double averageWithdrawal() {
        if (withdrawalsCount() > 0) {
            return withdrawals() / withdrawalsCount();
        } else {
            return 0;
        }
    }
}
