package fr.devoxx.eclipse;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import fr.devoxx.commonslang.Person;

public class PersonTest {
    @Test
    public void executeToString() {
        final String toString = newGod().toString();
        assertThat(toString) //
                .startsWith(Person.class.getName()) //
                .endsWith("[name=Norris,firstname=Chuck,age=71]");
        System.out.println(toString);
    }

    private Person newGod() {
        Person god = new Person();
        god.setName("Norris");
        god.setFirstname("Chuck");
        god.setAge(71);
        return god;
    }
}
