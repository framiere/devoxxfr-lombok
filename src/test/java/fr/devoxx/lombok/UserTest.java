package fr.devoxx.lombok;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import fr.devoxx.lombok.Person;

public class UserTest {
    @Test
    public void test() {
        Person chuck = newGod();
        Person chucky = newGod();
        assertThat(chuck).isEqualTo(chucky);
        assertThat(chuck.hashCode()).isEqualTo(chucky.hashCode());
        assertThat(chuck.toString()) //
                .startsWith(Person.class.getSimpleName()) //
                .endsWith("(name=Norris, firstname=Chuck, age=71)");
        System.out.println(chuck);
    }

    private Person newGod() {
        Person god = new Person();
        god.setName("Norris");
        god.setFirstname("Chuck");
        god.setAge(71);
        return god;
    }
}
