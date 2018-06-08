package com.example.android.tennisnewsapp;

public class News {

    //Title of the article
    private String mTitle;

    //Date and time of the article
    private String mDate;

    //url of the web site
    private String mUrl;

    //Category of the article
    private String mCategory;

    //Author's name
    private String mAuthor;

    //Create constructor for a new {@link News} object
    // @param title is the title of the article
    // @param date is the date of the published article
    // @param url is the url of the article
    // @param category is the category of the article

    public News(String title, String author, String date, String url, String category) {
        mTitle = title;
        mAuthor = author;
        mDate = date;
        mUrl = url;
        mCategory = category;

    }

    //Return the title
    public String getmTitle() {
        return mTitle;
    }

    //Return the author's name
    public String getmAuthor() {
        return mAuthor;
    }

    //Return the date
    public String getmDate() {
        return mDate;
    }

    //Return the url
    public String getmUrl() {
        return mUrl;
    }

    //Return the category
    public String getmCategory() {
        return mCategory;
    }
}
