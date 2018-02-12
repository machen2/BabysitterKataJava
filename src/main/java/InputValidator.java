public class InputValidator {
    public static final int fivePM = 17;
    public static final int midnight = 24;
    public static final int latestEndTime = 4;
    private int inputStartTime;
    private int inputEndTime;

    public InputValidator(int inputStartTime, int inputEndTime) {
        this.inputStartTime = validateStartTimeInput(inputStartTime);
        this.inputEndTime = validateEndTimeInput(inputEndTime);
    }

    private int validateEndTimeInput(int inputEndTime) {
        if ((inputEndTime > fivePM && inputEndTime < midnight) || (inputEndTime <= latestEndTime)) {
            return inputEndTime;
        }
        return latestEndTime;
    }

    private int validateStartTimeInput(int inputStartTime) {
        if (inputStartTime < fivePM) {
            return fivePM;
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
