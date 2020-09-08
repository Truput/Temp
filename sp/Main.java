package by.com.company.sp;

public class Main {
    public static void main(String[] args) {
        NumberReader reader = new NumberReader();
        DataValidator validator = new DataValidator();
        NumberParser parser = new NumberParser();
        NumberService service = new NumberService();
        PrintReport printReport = new PrintReport();

        String stringLeftLimit;
        stringLeftLimit = reader.readFromConsole();
        boolean checkStringLeftLimit;
        checkStringLeftLimit = validator.checkString(stringLeftLimit);
        validator.checkStringNumberRight(checkStringLeftLimit);
        int leftLimit;
        leftLimit = parser.stringToInt(stringLeftLimit);

        String stringNumber;
        stringNumber = reader.readFromConsole();
        boolean checkStringNumber;
        checkStringNumber = validator.checkString(stringNumber);
        validator.checkStringNumberRight(checkStringNumber);
        int number;
        number = parser.stringToInt(stringNumber);

        String stringRightLimit;
        stringRightLimit = reader.readFromConsole();
        boolean checkStringRightLimit;
        checkStringRightLimit = validator.checkString(stringRightLimit);
        validator.checkStringNumberRight(checkStringRightLimit);
        int rightLimit;
        rightLimit = parser.stringToInt(stringRightLimit);

        boolean checkInterval;
        checkInterval = validator.checkInterval(leftLimit, rightLimit);
        validator.checkToExistence(checkInterval);

        boolean leftInclude = true;
        boolean rightInclude = false;
        boolean checkBelongingToInterval;
        checkBelongingToInterval = service.checkBelongingToInterval(number, leftLimit, rightLimit, leftInclude, rightInclude);

        printReport.print(number, leftLimit, rightLimit, leftInclude, rightInclude, checkBelongingToInterval);
    }

}
