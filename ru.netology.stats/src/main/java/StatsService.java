public class StatsService {

    public int calcAllSalesSum(int[] monthlySales) {

        int AllSalesSum = 0;
        for (int monthlySale : monthlySales) {
            AllSalesSum += monthlySale;
        }
        return AllSalesSum;
    }

    public int calcAverageSum(int[] monthlySales) {
        int AllSalesSum = 0;
        for (int monthlySale : monthlySales) {
            AllSalesSum += monthlySale;
        }
        return AllSalesSum / monthlySales.length;
    }

    public int calcMaxMonthSales(int[] monthlySales) {

        int salesMax = monthlySales[0];
        int i = 1;
        int monthOfMaxSales = 1;
        while (i < monthlySales.length) {
            if (monthlySales[i] >= salesMax) {
                salesMax = monthlySales[i];
                monthOfMaxSales = i + 1;
            }
            i++;
        }
        return monthOfMaxSales;
    }

    public int calcMinMonthSales(int[] monthlySales) {

        int salesMin = monthlySales[0];
        int monthOfMinSales = 1;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] <= salesMin) {
                salesMin = monthlySales[i];
                monthOfMinSales = i + 1;
            }
        }
        return monthOfMinSales;
    }

    public int calcMonthsBelowAverage(int[] monthlySales) {
        double average = calcAverageSum(monthlySales);
        int monthsAboveCounter = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale > average) {
                monthsAboveCounter++;
            }
        }
        return monthsAboveCounter;
    }

    public int calcMonthsAboveAverage(int[] monthlySales) {
        double average = calcAverageSum(monthlySales);
        int monthsBelowCounter = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale < average) {
                monthsBelowCounter++;
            }
        }
        return monthsBelowCounter;
    }
}