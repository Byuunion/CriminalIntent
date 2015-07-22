package edu.xu.CriminalIntent;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;

public class Photo {
    private static final String TAG = "CrimePhoto";
    private static final String JSON_FILENAME = "filename";
    private String mFilename;
    private CrimeFragment cFrag;
    private int mOrientation;

    /** Create a Photo representing an existing file on disk */
    public Photo(String filename) {
        mFilename = filename;
    }
    public Photo(JSONObject json) throws JSONException {
        mFilename = json.getString(JSON_FILENAME);
    }
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_FILENAME, mFilename);
        return json;
    }
    public String getFilename() {
        return mFilename;
    }

    public int setOrientation(int orientation){
        return mOrientation = orientation;
    }

    public int getOrientation(){
        return mOrientation;
    }
}