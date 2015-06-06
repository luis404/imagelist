package com.lx.imagelist;

import android.net.Uri;

/**
 * Created by xzc on 15/6/7.
 */
public class TestData {
    private static DataItem[] mData;
    private static String[] sImgUrls = {
            "",
            "",
            ""
    };

    public TestData(){
        initDataSets();
    }

    private static void initDataSets(){
        mData = new DataItem[10];
        DataItem di= new DataItem();
        for(int i=0; i<sImgUrls.length; i++){
            di.setUri(Uri.parse(sImgUrls[i]));
            mData[i] = di;
        }
    }

    public static DataItem[] getDataSets(){
        if(mData == null){
            initDataSets();
        }
        return mData;
    }
}
