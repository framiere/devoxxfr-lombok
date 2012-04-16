package fr.devoxx.advanced.extension;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class PersonTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidNameThrowsException() {
        new Person(null, "info@devoxx.fr");
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyNameThrowsException() {
        new Person(" ", "info@devoxx.fr");
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidEmailThrowsException() {
        new Person("florent ramiere", "not and email");
    }

    @Test
    public void valid() {
        Person person = new Person("florent ramiere", "florent@ramiere.com");
        assertThat(person.getName()).isEqualTo("florent ramiere");
        assertThat(person.getEmail()).isEqualTo("florent@ramiere.com");
    }
}
