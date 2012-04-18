package fr.devoxx.advanced.extension;

import static org.fest.assertions.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class ExtensionUserTest {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");

    @Test(expected = IllegalArgumentException.class)
    public void invalidNameThrowsException() {
        new ExtensionUser(null, "info@devoxx.fr", new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyNameThrowsException() {
        new ExtensionUser(" ", "info@devoxx.fr", new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidEmailThrowsException() {
        new ExtensionUser("florent", "not and email", new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidBirthThrowsException() throws ParseException {
        new ExtensionUser("old florent", "florent@ramiere.com", DATE_FORMAT.parse("2075/04/06"));
    }

    @Test
    public void valid() throws ParseException {
        ExtensionUser person = new ExtensionUser("florent", "florent@ramiere.com", DATE_FORMAT.parse("1975/04/06"));
        assertThat(person.getName()).isEqualTo("florent");
        assertThat(person.getEmail()).isEqualTo("florent@ramiere.com");
    }
}
