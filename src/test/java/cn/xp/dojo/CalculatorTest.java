package cn.xp.dojo;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void should_equal_to_2_when_calculator_add_1_and_1() {
        // GIVEN
        Calculator calculator = new Calculator();

        // WHEN
        int result = calculator.add(1, 1);

        // THEN
        assertThat(result, equalTo(2));
    }
}
