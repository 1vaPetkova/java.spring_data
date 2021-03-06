package com.example.java_db_09_exercise.model.dto.Q04;

import com.google.gson.annotations.Expose;

public class UserInfoDto {
    //Q04
    @Expose
    private String firstName;
    @Expose
    private String lastName;
    @Expose
    private Integer age;
    @Expose
    private ProductCountAndInfoDto soldProducts;

    public UserInfoDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ProductCountAndInfoDto getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(ProductCountAndInfoDto soldProducts) {
        this.soldProducts = soldProducts;
    }
}
