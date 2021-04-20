import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calcAllSalesSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calcAllSalesSum(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcAverageSum() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calcAverageSum(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMaxMonthSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.calcMaxMonthSales(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMinMonthSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.calcMinMonthSales(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMonthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calcMonthsBelowAverage(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMonthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calcMonthsAboveAverage(monthlySales);
        assertEquals(expected, actual);
    }
}