import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonalAccount6Test {

    @Test
    public void tax6PercentOfIncome() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(50_000);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 3600;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentOfNewIncomeWithANegativeValue() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(50_000);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 3000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentOnNegativeNewExpense() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 3600;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentOnNegativeNewIncomeAndNewExpense() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 3000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentOnNegativeIncomeAndNewIncomeNewExpense() {
        PersonalAccount personalAccount = new PersonalAccount(-50_000, 10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentOnNegativeIncomeAndNewIncomeNewExpenseAndExpense() {
        PersonalAccount personalAccount = new PersonalAccount(-50_000, -10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentSpendingMoreThanIncome() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 60_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(10_000);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 3600;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentSpendingMoreThanIncomeAndNewExpensesZero() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 60_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(0);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 3600;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax6PercentIncomeLessExpenseIncreaseZero() {
        PersonalAccount personalAccount = new PersonalAccount(30_000, 60_000);

        personalAccount.addIncome(0);
        personalAccount.addExpenses(0);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 1800;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void everythingIsZeroButThereIsAnExpense() {
        PersonalAccount personalAccount = new PersonalAccount(0, 60_000);

        personalAccount.addIncome(0);
        personalAccount.addExpenses(0);

        double actual = personalAccount.calculationOfTaxesOnIncome();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}
