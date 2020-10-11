package com.example.postylyrics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {

    private String[] lyricsFound = new String[]{"Song 3 Lyrics", "Song 2 Lyrics", "Song 3 Lyrics", "Song 4 Lyrics", "Song 5 Lyrics", "Song 6 Lyrics",
            "Song 7 Lyrics", "Song 8 Lyrics", "Song 9 Lyrics", "Song 10 Lyrics", "Song 11 Lyrics", "Song 12 Lyrics", "Song 13 Lyrics","Song 14 Lyrics",
            "Song 15 Lyrics"};
    @BindView(R.id.searchTextView) TextView mSearchedText;
    @BindView(R.id.musicListView) ListView mMusicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lyricsFound);
        mMusicList.setAdapter(adapter);
        //getting/pull data from intent extra
        Intent intent = getIntent();
        String searched = intent.getStringExtra("searchedMusic");
        mSearchedText.setText(searched);

        mMusicList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String lyricItem = ((TextView)view).getText().toString();
                Toast.makeText(SearchActivity.this, lyricItem, Toast.LENGTH_LONG).show();
            }
        });

    }


}


