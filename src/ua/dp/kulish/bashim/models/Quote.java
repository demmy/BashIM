package ua.dp.kulish.bashim.models;

/**
 * This file is part of BashIM project
 * Copyright (C) 2013
 *
 * @author Denis K
 * @version 0.1
 *          created      04.08.13
 */
public class Quote {
    int id;
    int rating;
    String text;
    boolean favorite;

    public Quote(int _id, int _rating, String _text, boolean _favorite) {
        id = _id;
        rating = _rating;
        text = _text;
        favorite = _favorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        id = _id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int _rating) {
        rating = _rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String _text) {
        text = _text;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean _favorite) {
        favorite = _favorite;
    }
}
