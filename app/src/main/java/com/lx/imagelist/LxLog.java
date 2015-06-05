package com.lx.imagelist;

import android.util.Log;

/**
 * Created by douhua on 15/6/6.
 */
public class LxLog {
    public static final String TAG = "ImageList";

    public void d(String msg){
        if(LxApplication.LOG){
            Log.d(TAG, msg);
        }
    }

    public void d(String TAG, String msg){
        if(LxApplication.LOG){
            Log.d(TAG, msg);
        }
    }
}
