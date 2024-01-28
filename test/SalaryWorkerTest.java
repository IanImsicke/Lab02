import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker m1, m2, m3;


    @BeforeEach
    void setUp() {
        m1 = new SalaryWorker("000001", "Ian", "Imsicke", "Mr.", 2005, 30000);
        m2 = new SalaryWorker("000002", "George", "Cooper", "Mr.", 2005, 35000);
        m3 = new SalaryWorker("000003", "John", "Johnson", "Mr.", 2005, 50000);

    }

    @Test
    void calculateWeeklyPay() {

    }

    @Test
    void displayWeeklyPay() {
    }
}