package fr.devoxx.advanced.extension;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class ValidationUtils {
    public static boolean isEmail(String value) {
        // dummy implementation
        return value.contains("@") && value.contains(".");
    }

    public static boolean isNotBlank(String value) {
        return StringUtils.isNotBlank(value);
    }

    public static boolean inPast(Date date) {
        return date.before(new Date());
    }
}
