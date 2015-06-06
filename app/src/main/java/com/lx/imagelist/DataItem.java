package com.lx.imagelist;

import android.net.Uri;

/**
 * Created by xzc on 15/6/7.
 */
public class DataItem {
    private Uri mUri;

    public void setUri(Uri uri){
        mUri = uri;
    }

    public Uri getUri() {
        return mUri;
    }
}
