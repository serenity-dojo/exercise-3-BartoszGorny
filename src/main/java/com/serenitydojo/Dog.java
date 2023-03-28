package com.serenitydojo;

public class Dog {
    private String name;
    private int age;
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        this.name = name;
        this.age = age;
        this.favoriteToy = favoriteToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
}
