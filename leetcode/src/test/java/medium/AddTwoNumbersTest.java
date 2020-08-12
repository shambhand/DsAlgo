package medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {
    private AddTwoNumbers problem = new AddTwoNumbers();

    private static Stream<Object[]> testData() {
        return Stream.of(
                new Object[][]{
                        {createList(2, 4, 3), createList(5, 6, 4), createList(7, 0, 8), "TestCase-1"},
                        {createList(5), createList(5), createList(0, 1), "TestCase-2"},
                        {createList(7), createList(5), createList(2, 1), "TestCase-3"},
                });
    }

    @ParameterizedTest(name = "{3}")
    @MethodSource(value = "testData")
    void name(ListNode inputList1, ListNode inputList2, ListNode expectedList, String description) {
        assertEquals(expectedList, problem.addTwoNumbers(inputList1, inputList2));
    }

    private static ListNode createList(int... elements) {
        ListNode head = null, tempNode = null;
        for (int i = 0; i < elements.length; i++) {
            if (i == 0) {
                tempNode = head = new ListNode(elements[i]);
            } else {
                ListNode newNode = new ListNode(elements[i]);
                tempNode.next = newNode;
                tempNode = newNode;
            }
        }
        return head;
    }
}