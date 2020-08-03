import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shoulcalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void shoulcalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
}