package fr.devoxx.advanced.delegate;

import java.util.ArrayList;
import java.util.List;

import lombok.Delegate;

public class LombokDelegate {
    private interface ListExclude {
        int size();
    }

    @Delegate(excludes = ListExclude.class)
    private List<String> myList = new ArrayList<String>();

    public int size() {
        throw new IllegalStateException();
    }
}
