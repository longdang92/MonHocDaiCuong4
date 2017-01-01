package com.example.longdang.monhocdaicuong4.Model;

/**
 * Created by LONGDANG on 12/27/2016.
 */

public class MonHoc {
    private int mNumber;
    private String mName;
    private String mMaHP;

    public MonHoc(int mNumber, String mName, String mMaHP) {
        this.mNumber = mNumber;
        this.mName = mName;
        this.mMaHP = mMaHP;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmMaHP() {
        return mMaHP;
    }

    public void setmMaHP(String mMaHP) {
        this.mMaHP = mMaHP;
    }
}
