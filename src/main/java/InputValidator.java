import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputValidator {
    private int inputStartTime;

    public InputValidator(int inputStartTime) {
        this.inputStartTime = validateStartTimeInput(inputStartTime);
    }

    private int validateStartTimeInput(int inputStartTime) {
        if (inputStartTime < 17) {
            return 17;
        }
        return inputStartTime;
    }

    public int getStartTime() {
        return inputStartTime;
    }

}
