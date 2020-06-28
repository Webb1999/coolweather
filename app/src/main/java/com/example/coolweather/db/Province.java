package com.example.coolweather.db;


import org.litepal.crud.DataSupport;

/**
 * Created by Webb on 2020/6/28.
 */

public class Province extends DataSupport {
    private int id;
    private String provincemName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvincemName() {
        return provincemName;
    }

    public void setProvincemName(String provincemName) {
        this.provincemName = provincemName;
    }
}
