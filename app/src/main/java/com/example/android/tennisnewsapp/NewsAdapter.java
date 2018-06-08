package com.example.android.tennisnewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the title of the article in that TextView
        titleView.setText(currentNews.getmTitle());

        // Find the TextView with view ID url
        TextView urlView = (TextView) listItemView.findViewById(R.id.url);
        // Display the url of the article in that TextView
        urlView.setText(currentNews.getmUrl());

        //Find the TextView with the view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        //Display the author's name in that TextView
        authorView.setText(currentNews.getmAuthor());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date and time of the article in that TextView
        dateView.setText(formatDate(currentNews.getmDate()));

        // Find the TextView with view ID category
        TextView categoryView = (TextView) listItemView.findViewById(R.id.category);
        // Display the category of the article in that TextView
        categoryView.setText(currentNews.getmCategory());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    //Format date and time so we can easily read them
    private String formatDate(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss'Z'");
        Date dateObject = null;
        try {
            dateObject = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy hh:mm a");
        String date = simpleDateFormat.format(dateObject);

        return date;
    }
}
