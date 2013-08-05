package ua.dp.kulish.bashim.main;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.googlecode.androidannotations.annotations.EViewGroup;
import com.googlecode.androidannotations.annotations.ViewById;
import ua.dp.kulish.bashim.models.Quote;

/**
 * This file is part of BashIM project
 * Copyright (C) 2013
 *
 * @author Denis K
 * @version 0.1
 *          created      05.08.13
 */
@EViewGroup(R.layout.quote_item)
public class QuoteItemView extends LinearLayout {
    @ViewById
    TextView id;
    @ViewById
    TextView rating;
    @ViewById
    TextView text;
    @ViewById
    CheckBox fav;

    public QuoteItemView(Context context) {
        super(context);
    }

    public void bind(Quote _quote) {
        id.setText("#" + String.valueOf(_quote.getId()));
        rating.setText(" - " + String.valueOf(_quote.getRating()) + " + ");
        text.setText(String.valueOf(_quote.getText()));
        fav.setChecked(_quote.isFavorite());
    }
}
