package com.qimoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eva on 2017/12/7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
