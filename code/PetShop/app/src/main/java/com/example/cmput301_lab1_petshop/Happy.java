package com.example.cmput301_lab1_petshop;

import java.util.Date;
public class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }
    public Happy() {
        super();
    }

    @Override
    public String mood() {
        return "Happy";
    }

}
