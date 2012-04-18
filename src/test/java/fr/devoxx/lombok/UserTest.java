package fr.devoxx.lombok;

import static fr.devoxx.lombok.Person.person;
import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class UserTest {
    @Test
    public void god() {
        Person chuck = newGod();
        Person chucky = newGod();
        assertThat(chuck).isEqualTo(chucky);
        assertThat(chuck.hashCode()).isEqualTo(chucky.hashCode());
        assertThat(chuck.toString()) //
                .contains(Person.class.getSimpleName()) //
                .endsWith("(name=Norris, firstname=Chuck, age=72)");
    }

    private Person newGod() {
        return person().firstname("Chuck").name("Norris").age(72).build();
    }
}
