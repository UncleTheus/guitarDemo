package com.demo.guitar.po.type;

public class Type implements java.io.Serializable {

    //    ACOUSTIC("acoustic"),ELECTRIC("electric"),UNSPECIFIED("unspecified");
    private String value;

    public Type() {
    }

    public Type(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}