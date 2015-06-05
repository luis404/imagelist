package com.lx.imagelist;

import android.app.Application;

/**
 * Created by douhua on 15/6/6.
 */
public class LxApplication extends Application{
    public static boolean LOG = true;
    private static LxApplication sInstance;

    @Override
    public void onCreate(){
       sInstance = this;
        LOG = BuildConfig.DEBUG;
    }

    public static LxApplication getInstance(){
        return sInstance;
    }
}
