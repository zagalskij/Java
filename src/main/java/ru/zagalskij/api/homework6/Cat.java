package ru.zagalskij.api.homework6;

import java.util.Objects;

public class Cat {
    private String name;
    private Integer age;
    private  String breed;
    private String color;
    private String gender;

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void meow() {
        System.out.println("Meow!");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(age, cat.age) && Objects.equals(breed, cat.breed) && Objects.equals(color, cat.color) && Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, color, gender);
    }

    public Cat(String name, Integer age, String breed, String color, String gender) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
