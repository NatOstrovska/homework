package com.ua.homework18;

import java.util.Arrays;

public class OstrovskaList<E> {


    private static int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object elements[];

    public OstrovskaList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }


    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "OstroskaList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}

