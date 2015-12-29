package com.hfad.bitsandpizzas;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar;
import android.widget.Toast;

public class OrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        } else {
            Toast.makeText(this, "can't get actionBar object", Toast.LENGTH_LONG).show();
        }
    }
}
