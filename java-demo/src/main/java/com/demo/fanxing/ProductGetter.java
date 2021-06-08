package com.demo.fanxing;

import java.util.ArrayList;
import java.util.Random;

public class ProductGetter<T> {
    Random random = new Random();
    private T product;

    ArrayList<T> list = new ArrayList<>();

    public void addProduct(T t) {
        list.add(t);
    }

    public T chooseP() {
        return list.get(random.nextInt(list.size()));
    }

}
