package ru.mirea.task13;

import jdk.jshell.spi.ExecutionControl;

import java.util.*;

public class MyArrayList<E> implements List<E>  {
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] data;
    private int size;

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            this.data = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        }
    }

    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object elem: data) {
            if (o != null && elem == null) {
                return false;
            } else if (o == null && elem == null) {
                return true;
            }
            if (elem.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.data, size);
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return (T[]) Arrays.copyOf(this.data, size);
    }

    @Override
    public boolean add(E e) {
        if (this.size == data.length) {
            data = this.grow();
        }
        data[size++] = e;
        return true;
    }

    private Object[] grow() {
        int newCapacity = this.data.length << 1;
        return this.data = Arrays.copyOf(this.data, newCapacity);
    }

    @Override
    public boolean remove(Object o) {
        int i = 0;
        for (; i < data.length + 1; ++i) {
            if (i >= this.size) {
                return false;
            }
            if (data[i].equals(o)) {
                break;
            }
        }

        // Fast removal (from std)
        int newSize;
        if ((newSize = this.size - 1) > i) {
            System.arraycopy(this.data, i + 1, this.data, i, newSize - i);
        }
        this.data[this.size = newSize] = null;

        return true;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        for(int i  = 0; i < this.size; ++i) {
            this.data[i] = null;
        }
        this.size = 0;
    }

    @Override
    public E get(int i) {
        return (E) data[i];
    }

    @Override
    public E set(int i, E e) {
        return (E) (data[i] = e);
    }

    @Override
    public void add(int i, E e) {
    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public List<E> subList(int i, int i1) {
        return null;
    }
}
