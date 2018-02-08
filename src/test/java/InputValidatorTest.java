import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class InputValidatorTest {

    @Test
    public void given_UserEntersAValidStartTime_Then_ThatTimeIsSet(){
        int expectedStartTime = 17;
        InputValidator inputValidator = new InputValidator(expectedStartTime);
        assertEquals(expectedStartTime, inputValidator.getStartTime());
    }

    @Test
    public void given_UserEntersInvalidStartTime_Then_StartTimeIsSetTo5ByDefault() {
        int expectedStartTime = 17;
        int invalidStartTime = 2;
        InputValidator inputValidator = new InputValidator(invalidStartTime);
        assertEquals(expectedStartTime, inputValidator.getStartTime());
    }
}
