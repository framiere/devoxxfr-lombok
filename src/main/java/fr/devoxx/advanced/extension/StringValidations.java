package fr.devoxx.advanced.extension;

public class StringValidations {
    public static boolean isEmail(String value) {
        // dummy implementation
        return value.contains("@") && value.contains(".");
    }
}
