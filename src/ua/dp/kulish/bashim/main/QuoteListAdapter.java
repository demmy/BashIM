package ua.dp.kulish.bashim.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.googlecode.androidannotations.annotations.AfterInject;
import com.googlecode.androidannotations.annotations.EBean;
import com.googlecode.androidannotations.annotations.RootContext;
import ua.dp.kulish.bashim.models.Quote;
import ua.dp.kulish.bashim.parser.Parser;

import java.io.IOException;
import java.util.List;

/**
 * This file is part of BashIM project
 * Copyright (C) 2013
 *
 * @author Denis K
 * @version 0.1
 *          created      05.08.13
 */
@EBean
public class QuoteListAdapter extends BaseAdapter {

    List<Quote> mQuoteList;

    @RootContext
    Context mContext;

    @AfterInject
    void initAdapter() {
        Parser parser = new Parser();
        try {
            mQuoteList = parser.GetPage(1);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        QuoteItemView quoteItemView;

        if (convertView == null) {
            quoteItemView = QuoteItemView_.build(mContext);
        } else {
            quoteItemView = (QuoteItemView) convertView;
        }
        quoteItemView.bind(getItem(position));
        return quoteItemView;
    }

    @Override
    public int getCount() {
        return mQuoteList.size();
    }

    @Override
    public Quote getItem(int position) {
        return mQuoteList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
