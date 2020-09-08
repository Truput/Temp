package by.com.company.sp;

public class DataValidator {
    private final static String NUMBER_REGEX = "-?[0-9]{1,10}";

    public boolean checkString(String numberStr) {
        boolean result = numberStr.matches(NUMBER_REGEX);
        return result;
    }

    public boolean checkInterval(int left, int right) {
        return (right - left > 0);
    }

    public void checkToExistence(boolean checkInterval) {
        if (!checkInterval) {
            throw new IllegalArgumentException("Wrong interval!");
        }
    }

    public void checkStringNumberRight(boolean checkString) {
        if (!checkString) {
            throw new IllegalArgumentException("Wrong string!");
        }
    }
}
