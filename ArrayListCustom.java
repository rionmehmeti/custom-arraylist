

import java.util.Arrays;

public class ArrayListCustom {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListCustom() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public void add(Object element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public void add(int index, Object element) {
        checkIndexForAdd(index);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Object old = elements[index];
        elements[index] = element;
        return old;
    }

    public Object remove(int index) {
        checkIndex(index);
        Object removed = elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return removed;
    }

    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (element == null && elements[i] == null) return i;
            if (element != null && element.equals(elements[i])) return i;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

}
