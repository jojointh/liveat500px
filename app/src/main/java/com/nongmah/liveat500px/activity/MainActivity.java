package com.nongmah.liveat500px.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nongmah.liveat500px.R;
import com.nongmah.liveat500px.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance(), "MainFragment")
                    .commit();
        }

        initInstances();
    }

    private void initInstances() {

    }
}
