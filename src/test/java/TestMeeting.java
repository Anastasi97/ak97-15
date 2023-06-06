import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMeeting {

    @Test
    public void testMatchesPositive() {
        Meeting meeting = new Meeting(1, "Weekly Meeting", "Project A", "2021-08-25T10:00:00");
        assertTrue(meeting.matches("Meeting"));
        assertTrue(meeting.matches("Project"));
    }

    @Test
    public void testMatchesNegative() {
        Meeting meeting = new Meeting(1, "Weekly Meeting", "Project A", "2021-08-25T10:00:00");
        assertFalse(meeting.matches("Demo"));
        assertFalse(meeting.matches("Task"));
    }
}
