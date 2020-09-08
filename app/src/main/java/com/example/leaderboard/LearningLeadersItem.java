package com.example.leaderboard;

public class LearningLeadersItem {
    private int mImageResource;
    private String mFullName;
    private String mHoursEngaged;

    public LearningLeadersItem(int mImageResource, String mFullName, String mHoursEngaged){
        mImageResource=mImageResource;
        mFullName=mFullName;
        mHoursEngaged=mHoursEngaged;
    }
    public int getImageResource(){
        return  mImageResource;
    }
    public String getFullName(){
        return mFullName;
    }

    public String getHoursEngaged() {
        return mHoursEngaged;
    }
}