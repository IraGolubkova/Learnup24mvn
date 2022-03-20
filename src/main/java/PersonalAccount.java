public class PersonalAccount {

    private double income;
    private double expenses;

    public void addIncome(double newIncome) {
        if (newIncome >= 0) {
            this.income = income + newIncome;

        }

    }

    public void addExpenses(double newExpenses) {
        if (newExpenses >= 0)
            this.expenses = expenses + newExpenses;
    }

    public PersonalAccount(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;

    }

    public double calculationOfTaxesOnIncome() {
        double taxIncome = income * 6 / 100;
        if (taxIncome >= 0) {
            return taxIncome;
        } else {
            return 0;
        }
    }

    public double differenceBetweenIncomeAndExpenses() {
        double taxIncome = (income - expenses) * 15 / 100;
        if ((taxIncome >= 0)) {
            return taxIncome;
        } else {
            return 0;

        }
    }

}
//    Создайте новый репо. Реализуйте класс, который будет личным кабинетом
//        предпринимателя в налоговой. Он будет хранить доходы и расходы. Создайте по методу
//        для увеличения каждого из этих двух показателей (предусмотрите некорректный ввод).
//        Создайте два метода (по одному на каждый тип налогооблажения): один по расчёту
//        налогов как 6% от доходов, другой считает налоги как 15% от разницы между доходами и
//        расходами; разумеется, налоги не могут быть отрицательными.
//        Подключите JaCoCo в режиме генерации отчётов, покройте на 100%.