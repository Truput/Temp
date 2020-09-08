package by.com.company.sp;

import java.util.Scanner;

public class NumberReader {
    public String readFromConsole(){
        Scanner scanner = new scanner(System.in);
        String str = scanner.nextLine();
        //str = str.strip();
        if (str.isBlank()){
            throw new IllegalArgumentException();
        }
        return str;
    }
}
