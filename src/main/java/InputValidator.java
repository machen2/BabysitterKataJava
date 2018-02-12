public class InputValidator {
    private int inputStartTime;
    private int inputEndTime;

    public InputValidator(int inputStartTime, int inputEndTime) {
        this.inputStartTime = validateStartTimeInput(inputStartTime);
        this.inputEndTime = validateEndTimeInput(inputEndTime);
    }

    private int validateEndTimeInput(int inputEndTime) {
        if ((inputEndTime > 17 && inputEndTime < 24) || (inputEndTime <= 4)) {
            return inputEndTime;
        }
        return -1;
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

    public int getEndTime() {
        return inputEndTime;
    }

}
