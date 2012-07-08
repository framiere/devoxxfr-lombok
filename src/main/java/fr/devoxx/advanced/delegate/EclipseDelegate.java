package fr.devoxx.advanced.delegate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Built using <code>Sources/Generate Delegate Methods</code>
 */
public class EclipseDelegate implements List<String> {
    private List<String> myList = new ArrayList<String>();

    public int size() {
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public boolean contains(Object o) {
        return myList.contains(o);
    }

    public Iterator<String> iterator() {
        return myList.iterator();
    }

    public Object[] toArray() {
        return myList.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return myList.toArray(a);
    }

    public boolean add(String e) {
        return myList.add(e);
    }

    public boolean remove(Object o) {
        return myList.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return myList.containsAll(c);
    }

    public boolean addAll(Collection<? extends String> c) {
        return myList.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends String> c) {
        return myList.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return myList.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return myList.retainAll(c);
    }

    public void clear() {
        myList.clear();
    }

    public boolean equals(Object o) {
        return myList.equals(o);
    }

    public int hashCode() {
        return myList.hashCode();
    }

    public String get(int index) {
        return myList.get(index);
    }

    public String set(int index, String element) {
        return myList.set(index, element);
    }

    public void add(int index, String element) {
        myList.add(index, element);
    }

    public String remove(int index) {
        return myList.remove(index);
    }

    public int indexOf(Object o) {
        return myList.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return myList.lastIndexOf(o);
    }

    public ListIterator<String> listIterator() {
        return myList.listIterator();
    }

    public ListIterator<String> listIterator(int index) {
        return myList.listIterator(index);
    }

    public List<String> subList(int fromIndex, int toIndex) {
        return myList.subList(fromIndex, toIndex);
    }
}
