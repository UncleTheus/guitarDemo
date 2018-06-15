package com.demo.guitar.po.builder;

    public class Builder implements java.io.Serializable {

        //	JIANGSU("jiangsu"),SHANGHAI("shanghai"),SHANDONG("shandong");
        private String value;

        public Builder() {
        }

        public Builder(String value) {
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
