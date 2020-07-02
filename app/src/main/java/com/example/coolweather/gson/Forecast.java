package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Webb on 2020/7/2.
 */

public class Forecast {

    @SerializedName("date")
    public String date;

    @SerializedName("tmp")
    public Temperaure temperaure;

    @SerializedName("cond")
    public More more;

    public class Temperaure{
        public String max;

        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
