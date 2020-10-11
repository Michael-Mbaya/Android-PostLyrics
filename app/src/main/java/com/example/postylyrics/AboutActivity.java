package com.example.postylyrics;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AboutActivity extends AppCompatActivity {

    private String[] aboutDetails = new String[]{"Follow us on Twitter", "Follow us on Twitter", "Follow us on Twitter", "Follow us on Twitter",
            "Follow us on Twitter","Follow us on Twitter","Follow us on Twitter","Follow us on Twitter","Follow us on Twitter", "Follow us on Twitter"};
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
    }

}
