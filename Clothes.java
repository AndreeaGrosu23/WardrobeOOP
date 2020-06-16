package com.andreeagrosu;

public class Clothes {
    private int id;
    private String brandName;
    private TypeOfClothing type;
    private static int counter=0;

    public Clothes(String brandName, TypeOfClothing type) {
        counter++;
        this.id = counter;
        this.brandName = brandName;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public TypeOfClothing getType() {
        return type;
    }

}
