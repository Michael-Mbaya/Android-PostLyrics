package com.example.postylyrics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] lyricsFound = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};
    @BindView(R.id.searchTextView) TextView mSearchedText;
    @BindView(R.id.musicListView) ListView mMusicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lyricsFound);
        mMusicList.setAdapter(adapter);
        //getting/pull data from intent extra
        Intent intent = getIntent();
        String searched = intent.getStringExtra("searchedMusic");
        mSearchedText.setText(searched);

    }

    @Override
    public void onClick(View v){

    }



}
