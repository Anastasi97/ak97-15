import org.junit.jupiter.api.Test;

public class TestMeeting {

    @Test
    Meeting meeting = new Meeting(1, "Project Review", "ABC Inc.", "2022-01-01 10:00:00");
    assertTrue(meeting.matches("Project"));

    @Test
    Meeting meeting = new Meeting(1, "Project Review", "ABC Inc.", "2022-01-01 10:00:00");
    assertFalse(meeting.matches("Task"));
}
