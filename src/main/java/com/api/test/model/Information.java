package com.api.test.model;

import jakarta.persistence.*;

@Entity
@Table(name = "information")
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "country")
    private String country;

    public Information() {
    }

    public Information(Long id, String name, Integer age, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Information(String name, Integer age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
