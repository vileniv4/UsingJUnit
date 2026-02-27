import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = Calculator.instance.get();
    }

    @Test
    @DisplayName("Сложение положительных чисел")
    public void givenPositiveNumbers_whenPlus_thenReturnCorrectSum() {
        // given:
        int a = 5;
        int b = 10;
        int expected = 15;

        // when:
        int result = calculator.plus.apply(a, b);

        // then:
        Assertions.assertEquals(expected, result);
        Assertions.assertTrue(result > 0);  // дополнительный ассерт
    }

    @Test
    @DisplayName("Деление на ноль")
    public void givenZeroDivisor_whenDivide_thenThrowRuntimeException() {
        // given:
        int a = 10;
        int b = 0;

        // when & then:
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> calculator.divide.apply(a, b));

        // then (дополнительные проверки):
        Assertions.assertEquals("На ноль делить нельзя.", exception.getMessage());
        Assertions.assertNotNull(exception);
    }

    @Test
    @DisplayName("Проверка положительного числа")
    public void givenPositiveNumber_whenIsPositive_thenReturnTrue() {
        // given:
        int a = 5;

        // when & then:
        Assertions.assertTrue(calculator.isPositive.test(a));
    }

    @Test
    @DisplayName("Проверка отрицательного числа")
    public void givenNegativeNumber_whenIsPositive_thenReturnFalse() {
        // given:
        int a = -5;

        // when & then:
        Assertions.assertFalse(calculator.isPositive.test(a));
    }
}