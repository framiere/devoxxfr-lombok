package fr.devoxx.lombok;

import static lombok.AccessLevel.PRIVATE;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode(of = "name")
@ToString(exclude = { "age" })
public class PersonWithConfiguration {
    protected String name;
    @Setter(PRIVATE)
    private String firstname;
    @Getter
    @Setter
    private int age;
}
