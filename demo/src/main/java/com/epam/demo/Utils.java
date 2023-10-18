package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            int num = 0;
            if (str.matches("-?\\d+")) {
                num = Integer.parseInt(str);
            }
            if (num <= 0) {
                break;
            }
        }
        return true;
    }
}