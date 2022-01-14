package com.epam.lab;

import utils.StringUtils;

import java.util.Arrays;

public class Utils {
    static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).map(StringUtils::isPositiveNumber)
                .allMatch(aBoolean -> aBoolean);
    }
}
