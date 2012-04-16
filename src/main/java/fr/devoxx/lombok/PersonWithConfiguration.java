package fr.devoxx.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(exclude = { "age" })
@ToString(exclude = { "age" })
public class PersonWithConfiguration {
    protected String name;
    @Getter
    private String firstname;
    @Getter
    @Setter
    private int age;

    public PersonWithConfiguration(String name, String firstname, int age) {
        super();
        this.name = name;
        this.firstname = firstname;
        this.age = age;
    }

}
