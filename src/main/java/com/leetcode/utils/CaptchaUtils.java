package com.leetcode.utils;

import java.util.HashMap;
import java.util.Map;

public class CaptchaUtils {

    private final Map<String, String> MAP = new HashMap<>();

    private CaptchaUtils() {
    }

    private static class CaptchaUtilsHolder {
        static CaptchaUtils instance = new CaptchaUtils();
    }

    public static CaptchaUtils getInstance() {
        return CaptchaUtilsHolder.instance;
    }

    public void put(String key, String value) {
        this.MAP.put(key, value);
    }

    public String get(String key) {
        return this.MAP.get(key);
    }

}
