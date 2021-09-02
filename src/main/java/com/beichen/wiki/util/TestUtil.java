package com.beichen.wiki.util;

public class TestUtil {
    static class Car{
        int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    static class Origin{
        int id;
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Origin origin = new Origin();
        origin.setId(1);

        Car aaa =CopyUtil.copy(origin,new Car().getClass());
        System.out.println(aaa.getId());
    }
}
