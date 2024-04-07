package com.zgw.demo4;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private Object[] elementData = {};
    private int size;
    private int DEFAULT_CAPACITY = 10;

    public boolean add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size++] = e;
        return true;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elementData[index];
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) elementData[index];
        int moveFlag = size - index - 1;
        if (moveFlag != 0) {
            System.arraycopy(elementData, index + 1, elementData, index, moveFlag);
        }
        elementData[--size] = null;
        return e;
    }

    public int size() {
        return size;
    }

    public void forEach(MyConsumer<E> actions) {
        Objects.requireNonNull(actions);
        for (int i = 0; i < size; i++) {
            actions.accept((E) elementData[i]);
        }
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + "out of max length " + size);
        }
    }

    private void grow() {
        if (size == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            elementData = Arrays.copyOf(elementData, elementData.length + elementData.length >> 1);
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            E e = (E) elementData[i];
            sb.append(e).append(i == size - 1 ? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
