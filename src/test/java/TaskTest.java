import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class TaskTest {

    private String query;

    @Test
    public void testSimpleTaskFound() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleTaskFound2() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("бабушке");

        Assertions.assertFalse(actual);
    }
}
