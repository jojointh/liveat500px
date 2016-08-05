package com.nongmah.liveat500px;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by jojo1 on 03-Aug-16.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

    }
}
