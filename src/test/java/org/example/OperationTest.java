package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
    Operation operation;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before every class");
    }

    @BeforeEach
    void init() {
        System.out.println("Before called.");
        operation = new Operation();
    }

    @Test
    void testAddOperation() {
        assertEquals(7, operation.add(3, 4), "This should result to 7");
    }

    @Test
    void testSubtractOperation() {
        assertEquals(2, operation.subtract(5, 3), "This should result to 2");
    }

    @Test
    void testMultiplyOperation() {
        assertEquals(12, operation.multiply(3, 4), "This should result to 12");
    }

    @Test
    void testDivideOperation() {
        assertEquals(4, operation.divide(20, 5), "This should result to 4");
    }

    @Test
    void testIsNumber() {
        assertTrue(operation.isNumber("1234"));
    }

    @Test
    @Disabled
    void testIsNotNumber() {
        assertFalse(operation.isNumber("12345ab"));
    }

    @Test
    @DisplayName("Person with age 100")
    void testIsNull() {
        assertNull(operation.findPersonWithAge(100), "Person with age 100 does not exist");
    }

    @Test
    void testIsNotNull() {
        assertNotNull(operation.findPersonWithAge(12), "Person with age 12 must exist");
    }

}
