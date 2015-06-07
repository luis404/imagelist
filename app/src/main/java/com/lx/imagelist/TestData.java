package com.lx.imagelist;

import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by xzc on 15/6/7.
 */
public class TestData {
    private static ArrayList<DataItem> mData;
    private static String[] sImgUrls = {
            "http://t12.baidu.com/it/u=4095575894,102452705&fm=32&s=A98AA55F526172A6F6A058E50300A060&w=623&h=799&img.JPEG",
            "http://imgsrc.baidu.com/forum/pic/item/627c0fb30f2442a70be3d386d143ad4bd01302d5.jpg",
            "http://imgsrc.baidu.com/forum/pic/item/640f720e0cf3d7ca50051155f21fbe096a63a9cb.jpg"
    };

    public TestData(){
        initDataSets();
    }

    private static void initDataSets(){
        mData = new ArrayList<DataItem>();
        int len = sImgUrls.length;
        for(int i=0; i<len; i++) {
            DataItem di = new DataItem();
            di.setUri(Uri.parse(sImgUrls[i]));
            mData.add(di);
        }
    }

    public static ArrayList<DataItem> getDataSets(){
        if(mData == null){
            initDataSets();
        }
        return mData;
    }
}
