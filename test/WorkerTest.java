import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {


    Worker w1, w2, w3;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Ian", "Imsicke", "Mr,", 2005, 12.00);
        w2 = new Worker("000002", "John", "Johnson", "Mr,", 2005, 13.00);
        w3 = new Worker("000003", "George", "Cooper", "Mr,", 2005, 14.00);

    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {

    }



    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
    }
}