package ru.netology.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)

public class Smartphone extends Product {
    private String maker;


    public Smartphone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || maker.equals(search);
    }


}