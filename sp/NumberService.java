package by.com.company.sp;

public class NumberService {
    public boolean checkBelongingToInterval(int number, int leftLimit, int rightLimit, boolean leftInclude, boolean rightInclude) {
        boolean checkBelongingToInterval;
        if (leftInclude == true) {
            if (rightInclude == true) {
                if (number >= leftLimit && number <= rightLimit) {
                    checkBelongingToInterval = true;
                } else {
                    checkBelongingToInterval = false;
                }
            } else {
                if (number >= leftLimit && number < rightLimit) {
                    checkBelongingToInterval = true;
                } else {
                    checkBelongingToInterval = false;
                }
            }
        } else {
            if (rightInclude == true) {
                if (number > leftLimit && number <= rightLimit) {
                    checkBelongingToInterval = true;
                } else {
                    checkBelongingToInterval = false;
                }
            } else {
                if (number > leftLimit && number < rightLimit) {
                    checkBelongingToInterval = true;
                } else {
                    checkBelongingToInterval = false;
                }
            }
        }
        return checkBelongingToInterval;
    }
}
