package com.example.cmput301_lab1_petshop;

import java.util.Date;
public class Sad extends Mood {
    public Sad(Date date) {
        super(date);
    }
    public Sad() {
        super();
    }

    @Override
    public String mood() {
        return "Sad";
    }

}