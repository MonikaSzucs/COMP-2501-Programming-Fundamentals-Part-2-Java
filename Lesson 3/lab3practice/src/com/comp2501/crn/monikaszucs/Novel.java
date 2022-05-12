package com.comp2501.crn.monikaszucs;

public class Novel {
    public final String title;
    public final String authorName;
    public final int yearPublished;

    public Novel(final String title, final String authorName, final int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
