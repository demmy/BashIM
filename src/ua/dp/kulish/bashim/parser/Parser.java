package ua.dp.kulish.bashim.parser;

import android.util.Log;
import com.googlecode.androidannotations.annotations.EBean;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ua.dp.kulish.bashim.models.Quote;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This file is part of BashIM project
 * Copyright (C) 2013
 *
 * @author Denis K
 * @version 0.1
 *          created      04.08.13
 */
@EBean
public class Parser {
    private static final String TAG = Parser.class.getSimpleName();
    private final String URI = "http://bash.im/index/";

    public List<Quote> GetPage(int pageNumber) throws IOException {
        List<Quote> result = new ArrayList<Quote>();

        Document doc = Jsoup.connect(URI + pageNumber).get();
        Elements quotes = doc.getElementsByClass("quote");
        for (Element e : quotes) {
            String text = e.getElementsByClass("text").text();
            int rating = 0;
            int id = 0;
            if (text.length() > 0) {

                try {
                    String textRaiting = e.getElementsByClass("rating").first().text();
                    rating = Integer.parseInt(textRaiting);

                    String textId = e.getElementsByClass("id").first().text();
                    textId = textId.replaceAll("#", "");
                    id = Integer.parseInt(textId);

                    result.add(new Quote(id, rating, text, false));
                } catch (Exception ex) {
                    // рейтинг не число
                }

            }
            Log.d(TAG, "Rating: " + rating + " Quote: " + text);

        }

        return result;
    }

}
