package com.example.postylyrics.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

public class SearchListArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private String[] mTracks;
    private String[] mTrackArtists;

    public SearchListArrayAdapter(Context mContext, int resource, String[] mTracks, String[] mTrackArtists) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mTracks = mTracks;
        this.mTrackArtists = mTrackArtists;
    }

    @Override
    public Object getItem(int position) {
        String tracks = mTracks[position];
        String trackArtists = mTrackArtists[position];
        return String.format("%s \nSong By: %s", tracks, trackArtists);
    }

    @Override
    public int getCount() {
        return mTracks.length;
    }

}
