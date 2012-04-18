package fr.devoxx.advanced.extension;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class UserTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidNameThrowsException() {
        new User(null, "info@devoxx.fr");
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyNameThrowsException() {
        new User(" ", "info@devoxx.fr");
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidEmailThrowsException() {
        new User("florent ramiere", "not and email");
    }

    @Test
    public void valid() {
        User person = new User("florent ramiere", "florent@ramiere.com");
        assertThat(person.getName()).isEqualTo("florent ramiere");
        assertThat(person.getEmail()).isEqualTo("florent@ramiere.com");
    }
}
