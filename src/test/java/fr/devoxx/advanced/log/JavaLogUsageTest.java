package fr.devoxx.advanced.log;
import static org.fest.assertions.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaLogUsageTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setErr(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setErr(null);
    }

    @Test
    public void test() {
        new JavaLogUsage().log();
        assertThat(output.toString()).contains("Log using java.util.logging");
    }
}
