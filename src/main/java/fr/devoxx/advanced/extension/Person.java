package fr.devoxx.advanced.extension;

import static org.apache.commons.lang.StringUtils.isBlank;
import lombok.ExtensionMethod;
import lombok.Getter;

@ExtensionMethod(StringValidations.class)
@Getter
public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("Valid name required");
        }
        if (!email.isEmail()) {
            throw new IllegalArgumentException("Valid email required");
        }
        this.name = name;
        this.email = email;
    }
}
