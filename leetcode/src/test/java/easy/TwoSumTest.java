package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private TwoSum problem = new TwoSum();

    private static Stream<Object[]> testData() {
        return Stream.of(
                new Object[][]{
                        {new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}, "TestCase-1"},
                });
    }

    @ParameterizedTest(name = "{3}")
    @MethodSource(value = "testData")
    void name(int[] input, int target, int result[], String description) {
        assertArrayEquals(result, problem.twoSum(input, target));
    }
}