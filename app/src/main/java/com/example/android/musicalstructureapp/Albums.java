package com.example.android.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Albums implements Parcelable {
    private String mAlbumName;
    private String mAlbumYear;
    private int mImageResourceId;

    public Albums(String aName, String aYear, int imageResourceId) {
        mAlbumName = aName;
        mAlbumYear = aYear;
        mImageResourceId = imageResourceId;
    }

    protected Albums(Parcel in) {
        mAlbumName = in.readString();
        mAlbumYear = in.readString();
        mImageResourceId = in.readInt();
    }

    public static final Creator<Albums> CREATOR = new Creator<Albums>() {
        @Override
        public Albums createFromParcel(Parcel in) {
            return new Albums(in);
        }

        @Override
        public Albums[] newArray(int size) {
            return new Albums[size];
        }
    };

    public String getAlbumName() {
        return mAlbumName;
    }
    public String getmAlbumYear() {
        return mAlbumYear;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mAlbumName);
        parcel.writeString(mAlbumYear);
        parcel.writeInt(mImageResourceId);
    }
}

