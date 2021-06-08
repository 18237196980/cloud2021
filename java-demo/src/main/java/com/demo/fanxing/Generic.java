package com.demo.fanxing;

public class Generic<T> {

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Generic(T key) {
        this.key = key;
    }

    public Generic() {
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
