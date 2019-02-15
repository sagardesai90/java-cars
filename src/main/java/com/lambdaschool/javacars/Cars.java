package com.lambdaschool.javacars;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Cars
{
    private @Id @GeneratedValue Long id;
    private int year;
    private String brand;
    private int model;

    public cities ()
    {
        //default constructor
    }

    public Cities(int year, String brand, int model)
    {
        this.year = year;
        this.brand = brand;
        this.model = model;

    }
}
