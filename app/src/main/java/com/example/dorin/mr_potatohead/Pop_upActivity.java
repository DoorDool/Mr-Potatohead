package com.example.dorin.mr_potatohead;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Pop_upActivity  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.hashCode();

        getWindow().setLayout((int)(width*.6), (int)(height*.2));
    }
}
