package by.com.company.sp;

public class NumberParser {
    public int stringToInt(String strNumber) {
        try {
            int number = Integer.parseInt(strNumber);
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
