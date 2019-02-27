package se.indpro.advance_android.base;

import android.app.Application;

public class MyApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.create();
    }
}
