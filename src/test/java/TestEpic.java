import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TestEpic {

    @Test
    public void testMatches() {
        String[] subtasks = {"Implement login functionality", "Implement registration functionality", "Implement password reset functionality"};
        Epic epic = new Epic(1, subtasks);
        assertTrue(epic.matches("login"));
    }

    @Test
    public void testMatches2() {
        String[] subtasks = {"Implement login functionality", "Implement registration functionality", "Implement password reset functionality"};
        Epic epic = new Epic(1, subtasks);
        assertFalse(epic.matches("logout"));
    }
}
