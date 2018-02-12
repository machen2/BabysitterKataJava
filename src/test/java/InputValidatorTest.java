import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputValidatorTest {

    @Test
    public void given_UserEntersAValidStartTime_Then_ThatTimeIsSet(){
        int expectedStartTime = 17;
        int endTime = 2;
        InputValidator inputValidator = new InputValidator(expectedStartTime, endTime);
        assertEquals(expectedStartTime, inputValidator.getStartTime());
    }

    @Test
    public void given_UserEntersInvalidStartTime_Then_StartTimeIsSetTo17ByDefault() {
        int expectedStartTime = 17;
        int invalidStartTime = 2;
        int endTime = 2;
        InputValidator inputValidator = new InputValidator(invalidStartTime, endTime);
        assertEquals(expectedStartTime, inputValidator.getStartTime());
    }

    @Test
     public void given_UserEntersValidEndTime_Then_EndTimeIsSet() {
        int expectedEndTime = 4;
        int startTime = 17;
        InputValidator inputValidator = new InputValidator(startTime, expectedEndTime);
        assertEquals(expectedEndTime, inputValidator.getEndTime());
    }

    @Test
    public void given_UserEntersEndTimeBefore4_Then_EndTimeIsSet() {
        int expectedEndTime = 3;
        int startTime = 17;
        InputValidator inputValidator = new InputValidator(startTime, expectedEndTime);
        assertEquals(expectedEndTime, inputValidator.getEndTime());
    }
}
