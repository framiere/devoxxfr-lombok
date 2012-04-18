package fr.devoxx.advanced.extension;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.Date;

import lombok.ExtensionMethod;
import lombok.Getter;

@Getter
@ExtensionMethod(ValidationUtils.class)
public class ExtensionUser {
    private String name;
    private String email;
    private Date birth;

    public ExtensionUser(String name, String email, Date birth) {
        checkArgument(name.isNotBlank(), "name cannot be null or blank");
        checkArgument(email.isEmail(), "a valid email is required");
        checkArgument(birth.inPast(), "birth cannot be in future");
        this.name = name;
        this.email = email;
        this.birth = birth;
    }
}
