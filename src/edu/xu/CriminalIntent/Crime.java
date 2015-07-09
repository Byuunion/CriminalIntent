package edu.xu.CriminalIntent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private boolean mSolved;
    private Date mDate;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString(){
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public void setSolved(boolean solved){
        mSolved = solved;
    }

    public Date getDate(){ return mDate; }

    public void setDate(Date date) {mDate = date;}

    public boolean isSolved(){return mSolved;}

}