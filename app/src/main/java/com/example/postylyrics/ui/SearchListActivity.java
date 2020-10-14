package com.example.postylyrics.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.postylyrics.R;
import com.example.postylyrics.adapters.SearchListArrayAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchListActivity extends AppCompatActivity {

    private String[] tracksFound = new String[]{"Music Track 1", "Music Track 2", "Music Track 3", "Music Track 4", "Music Track 5", "Music Track 6",
            "Music Track 7", "Music Track 8", "Music Track 9", "Music Track 10","Music Track 11","Music Track 12","Music Track 13",
            "Music Track 14","Music Track 15"};

    private String[] tracksArtist = new String[] {"Artist OG.", "Mulamwah", "Azziad", "Dj Mo", "Shakila", "Size 8",
            "Namba Nane", "NF ft Logic", "Lil Baby", "Eminem", "Cardi B", "Migos", "Lil Pump",
            "Yelawolf", "Moji Short Baba" };

    @BindView(R.id.searchTextView) TextView mSearchedText;
    @BindView(R.id.tracksListView) ListView mTracksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchlist);
        ButterKnife.bind(this);
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tracksFound);
        SearchListArrayAdapter searchListArrayAdapter = new SearchListArrayAdapter(this, android.R.layout.simple_list_item_1, tracksFound,tracksArtist);
        mTracksList.setAdapter(searchListArrayAdapter);
        //getting/pull data from intent extra
        Intent intent = getIntent();
        String searched = intent.getStringExtra("searchedMusic");
        mSearchedText.setText(searched);

        mTracksList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String lyricItem = ((TextView)view).getText().toString();
                Toast.makeText(SearchListActivity.this, lyricItem, Toast.LENGTH_LONG).show();
            }
        });

    }


}


