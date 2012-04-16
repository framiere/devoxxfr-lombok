package fr.devoxx.lombok;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import fr.devoxx.lombok.PersonWithConfiguration;

public class PersonWithConfigurationTest {
    @Test
    public void test() {
        PersonWithConfiguration chuck = newGod();
        PersonWithConfiguration chucky = newGod();

        assertThat(chuck).isEqualTo(chucky);
        assertThat(chuck.hashCode()).isEqualTo(chucky.hashCode());
        assertThat(chuck.toString()) //
                .startsWith(PersonWithConfiguration.class.getSimpleName()) //
                .endsWith("(name=Norris, firstname=Chuck)");
        System.out.println(chuck);
    }

    private PersonWithConfiguration newGod() {
        return new PersonWithConfiguration("Norris", "Chuck", 71);
    }
}
