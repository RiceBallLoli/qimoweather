package com.qimoweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Eva on 2017/12/2.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceCode;
    private String provinceName;
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
