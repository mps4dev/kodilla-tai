package pl.mps.kodilla.bank;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {

    @Test
    public void shouldAddCashMachinesWork() {
        // given
       Bank bank = new Bank();

        // when
        bank.addCashMachines(new CashMachine[]{createCashMachine(new double[]{100.00, -50.00})});

        // then
        Assert.assertEquals(1, bank.getCashMachines().length);
    }

    @Test
    public void shouldAddCashMachinesWorkForEmptyArray() {
        // given
        Bank bank = new Bank();

        // when
        bank.addCashMachines(new CashMachine[0]);

        // then
        Assert.assertEquals(0, bank.getCashMachines().length);
    }

    @Test
    public void shouldAddCaheMachinesWorkForNullArray() {
        // given
        Bank bank = new Bank();

        // when
        bank.addCashMachines(null);

        // then
        Assert.assertEquals(0, bank.getCashMachines().length);
    }

    @Test
    public void shouldAddCashMachinesWorkForNotEmptyCashMachine() {
        // given
        Bank bank = createBank(new double[]{100.00, -50.00});

        // when
        bank.addCashMachines(new CashMachine[]{createCashMachine(new double[]{10.00, -5.00})});

        // then
        Assert.assertEquals(2, bank.getCashMachines().length);
    }

    @Test
    public void shouldBalanceWorkForEmptyCashMachine() {
        // given
        Bank bank = new Bank();

        // when
        double result = bank.balance();

        // then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void shouldBalanceWork() {
        // given
        Bank bank = createBank(new double[]{100.00, -50.00});

        // when
        double result = bank.balance();

        // then
        Assert.assertEquals(50.00, result, 0.01);
    }

    @Test
    public void shouldPaymentsCountWorkForEmptyCashMachine() {
        // given
        Bank bank = new Bank();

        // when
        int result = bank.paymentsCount();

        // then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldPaymentsCountWork() {
        // given
        Bank bank = createBank(new double[]{100.00, -50.00});

        // when
        int result = bank.paymentsCount();

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldWithdrawalsCountWorkForEmptyCashMachine() {
        // given
        Bank bank = new Bank();

        // when
        int result = bank.withdrawalsCount();

        // then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldWithdrawalsCountWork() {
        // given
        Bank bank = createBank(new double[]{100.00, -50.00});

        // when
        int result = bank.withdrawalsCount();

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldAveragePaymentWorkForEmptyCashMachine() {
        // given
        Bank bank = new Bank();

        // when
        double result = bank.averagePayment();

        // then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void shouldAveragePaymentWork() {
        // given
        Bank bank = createBank(new double[]{100.00, -50.00});

        // when
        double result = bank.averagePayment();

        // then
        Assert.assertEquals(100.00, result, 0.01);
    }

    @Test
    public void shouldAverageWithdrawalWorkForEmptyCashMachine() {
        // given
        Bank bank = new Bank();

        // when
        double result = bank.averageWithdrawal();

        // then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void shouldAverageWithdrawalWork() {
        // given
        Bank bank = createBank(new double[]{100.00, -50.00});

        // when
        double result = bank.averageWithdrawal();

        // then
        Assert.assertEquals(50.00, result, 0.01);
    }

    private CashMachine createCashMachine(double[] transactions) {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(transactions);
        return cashMachine;
    }

    private Bank createBank(double[] transactions) {
        Bank bank = new Bank();
        CashMachine cashMachine = createCashMachine(transactions);
        bank.addCashMachines(new CashMachine[]{cashMachine});
        return bank;
    }

}