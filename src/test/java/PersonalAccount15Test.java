import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonalAccount15Test {

    @Test
    public void differenceBetweenIncomeAndExpense() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(20_000);
        personalAccount.addExpenses(20_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 6000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void differenceBetweenIncomeAndExpensesWithNegativeNewIncome() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(50_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void differenceBetweenIncomeAndExpensesWithNegativeNewExpenses() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 7500;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void differenceBetweenIncomeAndExpensesWithNegativeNewIncomeAndNewExpenses() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 6000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void onNegativeIncomeAndNewIncomeNewExpense() {
        PersonalAccount personalAccount = new PersonalAccount(-50_000, 10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void onNegativeIncomeAndNewIncomeNewExpenseAndExpense() {
        PersonalAccount personalAccount = new PersonalAccount(-50_000, -10_000);

        personalAccount.addIncome(-10_000);
        personalAccount.addExpenses(-50_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void spendingMoreThanIncome() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 60_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(10_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void spendingMoreThanIncomeAndNewExpensesZero() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 60_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(0);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void incomeLessExpenseIncreaseZero() {
        PersonalAccount personalAccount = new PersonalAccount(30_000, 60_000);

        personalAccount.addIncome(0);
        personalAccount.addExpenses(0);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void everythingIsZeroButThereIsAnExpense() {
        PersonalAccount personalAccount = new PersonalAccount(0, 60_000);

        personalAccount.addIncome(0);
        personalAccount.addExpenses(0);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tax15PercentDifferenceBetweenIncomeAndExpenses() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(0);
        personalAccount.addExpenses(0);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 6000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void incomeIsLessThanExpenses15Percent() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 100_000);

        personalAccount.addIncome(0);
        personalAccount.addExpenses(0);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxWithTheSameValuesOfIncomeAndExpense() {
        PersonalAccount personalAccount = new PersonalAccount(50_000, 10_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(50_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void incomeAndTaxesAreTheSame() {
        PersonalAccount personalAccount = new PersonalAccount(10_000, 10_000);

        personalAccount.addIncome(10_000);
        personalAccount.addExpenses(10_000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void thereAreSignsInIncomeAndTaxes() {
        PersonalAccount personalAccount = new PersonalAccount(0, 10_000);

        personalAccount.addIncome(10__00);
        personalAccount.addExpenses(10__000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void incomeLargeNumberAndNewIncome() {
        PersonalAccount personalAccount = new PersonalAccount(1234567890, 10_000);

        personalAccount.addIncome(1234567890);
        personalAccount.addExpenses(10__000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 3.70367367E8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void incomeLargeNumberNegative() {
        PersonalAccount personalAccount = new PersonalAccount(-1234567890, 10_000);

        personalAccount.addIncome(-1234567890);
        personalAccount.addExpenses(10__000);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void incomeAndExpensesAreALargeNumber() {
        PersonalAccount personalAccount = new PersonalAccount(1234567890, 1234567890);

        personalAccount.addIncome(999999999);
        personalAccount.addExpenses(123999999);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 1.314E8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void everywhereMinusZero() {
        PersonalAccount personalAccount = new PersonalAccount(-0, -0);

        personalAccount.addIncome(-0);
        personalAccount.addExpenses(-0);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void differentNumberOfCharactersInANumber() {
        PersonalAccount personalAccount = new PersonalAccount(10_000, 50);

        personalAccount.addIncome(123);
        personalAccount.addExpenses(1234);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 1325.85;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void taxAndIncomeSeparatedByCommas() {
        PersonalAccount personalAccount = new PersonalAccount(10.123, 50.23);

        personalAccount.addIncome(123.5);
        personalAccount.addExpenses(123.23);

        double actual = personalAccount.differenceBetweenIncomeAndExpenses();
        double expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}