import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputValidatorTest {

    @Test
    public void given_UserEntersAValidStartTime_Then_ThatTimeIsSet(){
        InputValidator inputValidator = new InputValidator();
        assertEquals(5, inputValidator.getStartTime());
    }
}
