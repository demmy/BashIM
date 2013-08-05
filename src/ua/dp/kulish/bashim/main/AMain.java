package ua.dp.kulish.bashim.main;

import android.os.Bundle;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockActivity;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Bean;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.main)
public class AMain extends SherlockActivity {

    @ViewById
    ListView list;

    @Bean
    QuoteListAdapter mAdapter;

    @AfterViews
    void bindAdapter() {
        list.setAdapter(mAdapter);
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
