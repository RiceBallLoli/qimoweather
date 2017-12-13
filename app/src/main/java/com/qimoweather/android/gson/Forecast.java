package com.qimoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eva on 2017/12/7.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public Now.More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
