package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int num = 0;
        if (str.matches("-?\\d+")) {
            num = Integer.parseInt(str);
        }
        return num > 0;
    }
}
