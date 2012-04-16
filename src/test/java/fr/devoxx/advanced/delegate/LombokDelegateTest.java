package fr.devoxx.advanced.delegate;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import fr.devoxx.advanced.delegate.LombokDelegate;

public class LombokDelegateTest {

    LombokDelegate delegate;

    @Before
    public void setup() {
        delegate = new LombokDelegate();
    }

    @Test
    public void test() {
        assertThat(delegate.isEmpty()).isTrue();
    }

    @Test(expected = IllegalStateException.class)
    public void complexThrowsException() {
        delegate.size();
    }
}
