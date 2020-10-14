package com.example.postylyrics.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.postylyrics.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AboutActivity extends AppCompatActivity {

    private String[] aboutDetails = new String[]{"Follow us on LinkedIn", "Follow us on YouTube", "Follow us on Pinterest", "Follow us on Snapchat",
            "Follow us on Facebook", "Follow us on Twitter", "Follow us on Instagram", "Follow us on TikTok", "Follow us on Yelp", "Follow us on Flickr"};
    @BindView(R.id.aboutListView) ListView mAboutListView;
    @BindView(R.id.aboutTextView) TextView mAboutTextView;
    @BindView(R.id.logoImageView) ImageView mAboutImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, aboutDetails);
        mAboutListView.setAdapter(adapter);

        mAboutListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String aboutItem = ((TextView) view).getText().toString();
                Toast.makeText(AboutActivity.this, aboutItem, Toast.LENGTH_LONG).show();

            }

        });
    }
}