public class InputValidator {
    private static final int fivePM = 17;
    private static final int midnight = 24;
    private static final int latestEndTime = 4;
    private int inputStartTime;
    private int inputEndTime;
    private int inputBedTime;

    public InputValidator(int inputStartTime, int inputEndTime, int inputBedTime) {
        this.inputStartTime = inputStartTime;
        this.inputEndTime = inputEndTime;
        this.inputBedTime = inputBedTime;
    }

    private int validateEndTimeInput(int inputEndTime) {
        if ((inputEndTime > fivePM && inputEndTime <= midnight) || (inputEndTime <= latestEndTime)) {
            return inputEndTime;
        }
        return -1;
    }

    private int validateStartTimeInput(int inputStartTime) {
        if (inputStartTime < fivePM && inputStartTime > 4) {
            return -1;
        }
        return inputStartTime;
    }

    public int validateStartAndEndTimes() {
        inputEndTime = validateEndTimeInput(inputEndTime);
        inputStartTime = validateStartTimeInput(inputStartTime);
        if (inputStartTime == -1 || inputEndTime == -1 || isStartTimeAfterEndTime() || areStartAndEndTimesConflicting()) {
            return -1;
        }
        return validateBedTime();
    }

    private int validateBedTime() {
        if (inputBedTime < inputStartTime || inputBedTime > inputEndTime) {
            return -1;
        }
        return 1;
    }

    public int getStartTime() {
        return inputStartTime;
    }

    public int getEndTime() {
        return inputEndTime;
    }

    private boolean areStartAndEndTimesConflicting() {
        return (inputStartTime >=1 && inputStartTime <= 4) && (inputEndTime <= 24 && inputEndTime >= 17);
    }

    private boolean isStartTimeAfterEndTime() {
        return inputStartTime > inputEndTime;
    }
}