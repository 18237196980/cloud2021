package com.demo.fanxing;

public class Test1 {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>("张三");
        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.setKey(987);

        System.out.println(integerGeneric);


        ProductGetter<String> productGetter = new ProductGetter<>();

        String[] strs = {"iphone8s", "机器人", "咖啡机"};

        for (int i = 0; i < strs.length; i++) {
            productGetter.addProduct(strs[i]);
        }

        String chooseP = productGetter.chooseP();
        System.out.println("最终抽中:" + chooseP);
    }
}
