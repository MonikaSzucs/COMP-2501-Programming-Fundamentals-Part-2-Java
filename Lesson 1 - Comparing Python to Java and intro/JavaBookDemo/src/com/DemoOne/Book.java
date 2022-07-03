package com.DemoOne;

public class Book {
    // instance variables:
    private final String title;
    private final int yearPublished;
    private final boolean fiction;
    private final char edition;
    private double priceCad;

    // constructor
    Book(final String title, final int yearPublished, final double priceCad, final boolean fiction, final char edition)
    {
        this.title = title;
        this.yearPublished = yearPublished;
        this.priceCad = priceCad;
        this.fiction = fiction;
        this.edition = edition;
    }

    public String getTitle()
    {
        return title;
    }

}
