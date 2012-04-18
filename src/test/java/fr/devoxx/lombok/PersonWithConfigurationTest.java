package fr.devoxx.lombok;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import fr.devoxx.lombok.PersonWithConfiguration;

public class PersonWithConfigurationTest {
    @Test
    public void god() {
        PersonWithConfiguration chuck = chuck();
        PersonWithConfiguration mike = mike();

        assertThat(chuck).isEqualTo(mike);
        assertThat(chuck.hashCode()).isEqualTo(mike.hashCode());
        assertThat(chuck.toString()) //
                .contains(PersonWithConfiguration.class.getSimpleName()) //
                .endsWith("(name=Norris, firstname=Chuck)");
    }

    private PersonWithConfiguration chuck() {
        return new PersonWithConfiguration("Norris", "Chuck", 72);
    }

    private PersonWithConfiguration mike() {
        return new PersonWithConfiguration("Norris", "Mike", 49);
    }
}
