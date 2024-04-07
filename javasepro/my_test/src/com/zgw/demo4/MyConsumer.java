package com.zgw.demo4;

@FunctionalInterface
public interface MyConsumer<E> {
    void accept(E e);
}
