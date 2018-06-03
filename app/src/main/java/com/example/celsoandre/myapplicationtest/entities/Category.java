package com.example.celsoandre.myapplicationtest.entities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Categories")
public class Category extends Model {

    @Column(name = "Name")
    public String name;


    public Category() {
        super();
    }

    public Category(String name) {
        super();
        this.name = name;
    }
}
