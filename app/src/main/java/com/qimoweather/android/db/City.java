package com.qimoweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Eva on 2017/12/2.
 */

public class City extends DataSupport {
    private int id;
    private int cityCode;
    private String cityName;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
