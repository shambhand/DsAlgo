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
                        {new int[]{3, 2, 4}, 6, new int[]{1, 2}, "TestCase-2"},
                        {new int[]{3, 2, 3}, 6, new int[]{0, 2}, "TestCase-3"},
                        {new int[]{-1, -2, -3, -4, -5}, -8, new int[]{2, 4}, "TestCase-4"},
                });
    }

    @ParameterizedTest(name = "{3}")
    @MethodSource(value = "testData")
    void name(int[] input, int target, int result[], String description) {
        assertArrayEquals(result, problem.twoSum(input, target));
    }
}