package com.lx.imagelist;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by xzc on 15/6/6.
 */
public class LxApplication extends Application {
    public static boolean LOG = true;
    private static LxApplication sInstance;

    @Override
    public void onCreate() {
        sInstance = this;
        LOG = BuildConfig.DEBUG;

        Fresco.initialize(this);
    }

    public static LxApplication getInstance() {
        return sInstance;
    }
}
