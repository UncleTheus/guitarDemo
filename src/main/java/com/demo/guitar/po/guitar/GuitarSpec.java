package com.demo.guitar.po.guitar;

import java.util.Objects;

public class GuitarSpec {

    private String builder;


    private String type;

    private String backWood;

    private String topWood;



    public GuitarSpec() {
    }


    public GuitarSpec(String builder, String type, String backWood, String topWood) {
        super();
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }


    public boolean matches(GuitarSpec otherSpec) {
        if (otherSpec.builder != null && !Objects.equals(builder, otherSpec.builder)) {
            return false;
        }

        if (otherSpec.type != null && !Objects.equals(type, otherSpec.type)) {
            return false;
        }

        if (otherSpec.backWood != null && !Objects.equals(backWood, otherSpec.backWood)) {
            return false;
        }
        return otherSpec.topWood == null || Objects.equals(topWood, otherSpec.topWood);
    }


    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }



    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder='" + builder + '\'' +
                ", type='" + type + '\'' +
                ", backWood='" + backWood + '\'' +
                ", topWood='" + topWood + '\'' +

                '}';
    }
}
