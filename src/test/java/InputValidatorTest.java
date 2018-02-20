import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputValidatorTest {

    @Test
    public void given_UserEntersAValidStartTime_Then_ThatTimeIsSet(){
        int expectedStartTime = 17;
        int endTime = 2;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(expectedStartTime, endTime, bedTime);
        inputValidator.validateStartAndEndTimes();
        assertEquals(expectedStartTime, inputValidator.getStartTime());
    }

    @Test
    public void given_UserEntersInvalidStartTime_Then_StartTimeReturnsNeg1() {
        int expectedStartTime = -1;
        int invalidStartTime = 12;
        int endTime = 12;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(invalidStartTime, endTime, bedTime);
        inputValidator.validateStartAndEndTimes();
        assertEquals(expectedStartTime, inputValidator.getStartTime());
    }

    @Test
     public void given_UserEntersValidEndTime_Then_EndTimeIsSet() {
        int expectedEndTime = 4;
        int startTime = 17;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(startTime, expectedEndTime, bedTime);
        inputValidator.validateStartAndEndTimes();
        assertEquals(expectedEndTime, inputValidator.getEndTime());
    }

    @Test
    public void given_UserEntersEndTimeBefore4_Then_EndTimeIsSet() {
        int expectedEndTime = 3;
        int startTime = 17;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(startTime, expectedEndTime, bedTime);
        inputValidator.validateStartAndEndTimes();
        assertEquals(expectedEndTime, inputValidator.getEndTime());
    }

    @Test
    public void given_UserEntersValidEndTimeBetween17And4am_Then_EndTimeIsSet() {
        int expectedEndTime = 23;
        int startTime = 17;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(startTime, expectedEndTime, bedTime);
        inputValidator.validateStartAndEndTimes();
        assertEquals(expectedEndTime, inputValidator.getEndTime());
    }

    @Test
    public void given_UserEntersInValidEndTime_Then_ValidatorReturnsNeg1() {
        int expectedEndTime = -1;
        int startTime = 17;
        int endTime = 5;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(startTime, endTime, bedTime);
        inputValidator.validateStartAndEndTimes();
        assertEquals(expectedEndTime, inputValidator.getEndTime());
    }

    @Test
    public void given_UserEntersEndTimeBeforeStartTime_Then_EndTimeReturnsNeg1() {
        int expectedEndTime = -1;
        int startTime = 20;
        int endTime = 18;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(startTime, endTime, bedTime);
        assertEquals(expectedEndTime, inputValidator.validateStartAndEndTimes());
    }

    @Test
    public void given_UserEntersEndTimeOf20AndStartTimeOf1_Then_ValidatorReturnsNeg1() {
        int expectedOutput = -1;
        int startTime = 1;
        int endTime = 20;
        int bedTime = 19;
        InputValidator inputValidator = new InputValidator(startTime, endTime, bedTime);
        assertEquals(expectedOutput, inputValidator.validateStartAndEndTimes());
    }

    @Test
    public void given_UserEntersABedtimeBeforeStartTime_Then_ValidatorReturnsNeg1() {
        int expectedOutput = -1;
        int startTime = 17;
        int endTime = 19;
        int bedTime = 16;
        InputValidator inputValidator = new InputValidator(startTime,endTime,bedTime);
        assertEquals(expectedOutput, inputValidator.validateStartAndEndTimes());
    }

    @Test
    public void given_UserEntersABedtimeAfterEndTime_Then_ValidatorReturnsNeg1() {
        int expectedOutput = -1;
        int startTime = 17;
        int endTime = 19;
        int bedTime = 20;
        InputValidator inputValidator = new InputValidator(startTime,endTime,bedTime);
        assertEquals(expectedOutput, inputValidator.validateStartAndEndTimes());
    }

    @Test
    public void given_UserEntersValidTimes_Then_ValidatorReturns1() {
        int expectedOutput = 1;
        int startTime = 17;
        int endTime = 24;
        int bedTime = 20;
        InputValidator inputValidator = new InputValidator(startTime,endTime,bedTime);
        assertEquals(expectedOutput, inputValidator.validateStartAndEndTimes());
    }

    @Test
    public void given_UserEntersSameStartAndEndTime_Then_ValidatorReturnsNeg1() {
        int expectedOutput = -1;
        int startTime = 19;
        int endTime = 19;
        int bedTime = 17;
        InputValidator inputValidator = new InputValidator(startTime,endTime,bedTime);
        assertEquals(expectedOutput, inputValidator.validateStartAndEndTimes());
    }
//
//    @Test
//    public void given_UserEntersABedtimeBeforeMidnightAndEndTimeIsAfterMidnight_Then_ValidatorReturns() {
//        int expectedOutput = -1;
//        int startTime = 17;
//        int endTime = 19;
//        int bedTime = 20;
//        InputValidator inputValidator = new InputValidator(startTime,endTime,bedTime);
//        assertEquals(expectedOutput, inputValidator.validateStartAndEndTimes());
//    }

}
