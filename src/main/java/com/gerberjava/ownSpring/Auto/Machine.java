package com.gerberjava.ownSpring.Auto;

public class Machine
{
    private String name;
    private Product product;

    public Machine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return  name +" produkuje "+product ;
    }
}
