package utils;

import entities.Phone;

import java.util.Map;
import java.util.Scanner;

public class Utils {
        public boolean continueOrBreak(Scanner scanner) {
            System.out.println("Continue? (Y/N)");
            String option = scanner.nextLine();
            return option.equalsIgnoreCase("Y");
        }
}
