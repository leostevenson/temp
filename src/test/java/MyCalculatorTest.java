import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MyCalculatorTest {

    @Test
    void myPlus() {
        assertEquals(3, MyCalculator.myPlus(1,2));
    }
}