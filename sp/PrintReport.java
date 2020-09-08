package by.com.company.sp;

public class PrintReport {
    public void print(int number, int leftLimit, int rightLimit, boolean leftInclude, boolean rightInclude, boolean checkBelongingToInterval) {
        if (leftInclude == true && rightInclude == true) {
            if (!checkBelongingToInterval) {
                System.out.println("Number " + number + " doesn't belong to interval " + "[" + leftLimit + ";" + rightLimit + "]");
            } else {
                System.out.println("Number " + number + " belongs to interval " + "[" + leftLimit + ";" + rightLimit + "]");
            }
        } else if (leftInclude == false && rightInclude == false) {
            if (!checkBelongingToInterval) {
                System.out.println("Number " + number + " doesn't belong to interval " + "(" + leftLimit + ";" + rightLimit + ")");
            } else {
                System.out.println("Number " + number + " belongs to interval " + "(" + leftLimit + ";" + rightLimit + ")");
            }
        } else if (leftInclude == true && rightInclude == false) {
            if (!checkBelongingToInterval) {
                System.out.println("Number " + number + " doesn't belong to interval " + "[" + leftLimit + ";" + rightLimit + ")");
            } else {
                System.out.println("Number " + number + " belongs to interval " + "[" + leftLimit + ";" + rightLimit + ")");
            }
        } else if (leftInclude == false && rightInclude == true) {
            if (!checkBelongingToInterval) {
                System.out.println("Number " + number + " doesn't belong to interval " + "(" + leftLimit + ";" + rightLimit + "]");
            } else {
                System.out.println("Number " + number + " belongs to interval " + "(" + leftLimit + ";" + rightLimit + "]");
            }
        }
    }
}
