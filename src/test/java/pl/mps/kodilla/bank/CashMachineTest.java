package pl.mps.kodilla.bank;

import org.junit.Assert;
import org.junit.Test;

public class CashMachineTest {

    @Test
    public void shouldAddTransactionsWork() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        cashMachine.addTransactions(new double[]{100.00, -50.00});

        // then
        Assert.assertEquals(2, cashMachine.transactionsCount());
    }

    @Test
    public void shouldAddTransactionsWorkForEmptyArray() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        cashMachine.addTransactions(new double[0]);

        // then
        Assert.assertEquals(0, cashMachine.transactionsCount());
    }

    @Test
    public void shouldAddTransactionsWorkForNullArray() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        cashMachine.addTransactions(null);

        // then
        Assert.assertEquals(0, cashMachine.transactionsCount());
    }

    @Test
    public void shouldAddTransactionsWorkForNotEmptyCashMachine() {
        // given
        CashMachine cashMachine = createCashMachine(new double[]{100.00, -50.00});

        // when
        cashMachine.addTransactions(new double[]{10.00, -5.00});

        // then
        Assert.assertEquals(4, cashMachine.transactionsCount());
    }

    @Test
    public void shouldTransactionsCountWorkForEmptyCashMachine() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        int result = cashMachine.transactionsCount();

        // then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldTransactionsCountWork() {
        // given
        CashMachine cashMachine = createCashMachine(new double[]{100.00, -50.00});

        // when
        int result = cashMachine.transactionsCount();

        // then
        Assert.assertEquals(2, result);
    }

    @Test
    public void shouldBalanceWorkForEmptyCashMachine() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        double result = cashMachine.balance();

        // then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void shouldBalanceWork() {
        // given
        CashMachine cashMachine = createCashMachine(new double[]{100.00, -50.00});

        // when
        double result = cashMachine.balance();

        // then
        Assert.assertEquals(50.00, result, 0.01);
    }

    @Test
    public void shouldPaymentsCountWorkForEmptyCashMachine() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        int result = cashMachine.paymentsCount();

        // then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldPaymentsCountWork() {
        // given
        CashMachine cashMachine = createCashMachine(new double[]{100.00, -50.00});

        // when
        int result = cashMachine.paymentsCount();

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldWithdrawalsCountWorkForEmptyCashMachine() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        int result = cashMachine.withdrawalsCount();

        // then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldWithdrawalsCountWork() {
        // given
        CashMachine cashMachine = createCashMachine(new double[]{100.00, -50.00});

        // when
        int result = cashMachine.withdrawalsCount();

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldPaymentsWorkForEmptyCashMachine() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        double result = cashMachine.payments();

        // then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void shouldPaymentsWork() {
        // given
        CashMachine cashMachine = createCashMachine(new double[]{100.00, -50.00});

        // when
        double result = cashMachine.payments();

        // then
        Assert.assertEquals(100.00, result, 0.01);
    }

    @Test
    public void shouldWithdrawalsWorkForEmptyCashMachine() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        double result = cashMachine.withdrawals();

        // then
        Assert.assertEquals(0, result, 0.01);
    }

    @Test
    public void shouldWithdrawalsWork() {
        // given
        CashMachine cashMachine = createCashMachine(new double[]{100.00, -50.00});

        // when
        double result = cashMachine.withdrawals();

        // then
        Assert.assertEquals(50.00, result, 0.01);
    }

    private CashMachine createCashMachine(double[] transactions) {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(transactions);
        return cashMachine;
    }

}