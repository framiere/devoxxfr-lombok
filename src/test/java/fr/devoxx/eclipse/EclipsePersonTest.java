package fr.devoxx.eclipse;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class EclipsePersonTest {
    @Test
    public void god() {
        EclipsePerson god = newGod();
        assertThat(god.getFirstname()).isEqualTo("Chuck");
        assertThat(god.getName()).isEqualTo("Norris");
        assertThat(god.getAge()).isEqualTo(72);
        assertThat(god.toString()) //
                .contains(EclipsePerson.class.getSimpleName()) //
                .endsWith("[name=Norris, firstname=Chuck, age=72]");
    }

    private EclipsePerson newGod() {
        EclipsePerson chuck = new EclipsePerson();
        chuck.setName("Norris");
        chuck.setFirstname("Chuck");
        chuck.setAge(72);
        return chuck;
    }
}