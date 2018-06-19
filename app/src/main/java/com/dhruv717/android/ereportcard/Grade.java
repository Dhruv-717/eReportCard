package com.dhruv717.android.ereportcard;

public class Grade {
    public String mGrade;
    public String mSub;
    public String mSlot;

    public Grade(String str,String str1,String str2){
        this.mGrade = str;
        this.mSub = str1;
        this.mSlot = str2;
    }

    public String getmGrade() {
        return mGrade;
    }

    public String getmSlot() {
        return mSlot;
    }

    public String getmSub() {
        return mSub;
    }
}
