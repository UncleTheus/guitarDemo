package com.demo.guitar.po.guitar;

public class Guitar implements java.io.Serializable {

    private Integer id;

    private Double price;

    private GuitarSpec spec;

    public Guitar() {
        this.spec = new GuitarSpec();
    }

    public Guitar(Double price, String builder, String type, String backWood,
                  String topWood) {
        this.price = price;
        this.spec = new GuitarSpec(builder, type, backWood, topWood);
    }


    public String getBuilder() {
        return spec.getBuilder();
    }

    public void setBuilder(String builder) {
        spec.setBuilder(builder);
    }



    public String getType() {
        return spec.getType();
    }

    public void setType(String type) {
        spec.setType(type);
    }

    public String getBackWood() {
        return spec.getBackWood();
    }

    public void setBackWood(String backWood) {
        spec.setBackWood(backWood);
    }

    public String getTopWood() {
        return spec.getTopWood();
    }

    public void setTopWood(String topWood) {
        spec.setTopWood(topWood);
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        //return new GuitarSpec(builder,model,type,backWood,topWood,numStrings);
        return spec;
    }

    public void setSpec(GuitarSpec spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", spec=" + spec.toString() +
                '}';
    }
}
