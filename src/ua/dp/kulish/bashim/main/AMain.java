package ua.dp.kulish.bashim.main;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.googlecode.androidannotations.annotations.EActivity;

@EActivity(R.layout.main)
public class AMain extends SherlockActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
