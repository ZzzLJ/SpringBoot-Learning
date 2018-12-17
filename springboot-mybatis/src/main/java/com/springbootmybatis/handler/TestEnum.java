package com.springbootmybatis.handler;

public enum TestEnum {
    Temperature,Humidity;
}

class Test{
    public static void main(String[] args) {
        System.out.println(TestEnum.Humidity);
        System.out.println(Enum.valueOf(TestEnum.class,""));

    }
}