package com.example.postylyrics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.searchButton) Button mSearchButton;
    @BindView(R.id.editTexSearch) EditText mEditTextSearch;
    @BindView(R.id.infoImageView) ImageView mInfoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSearchButton.setOnClickListener(this);
//        mInfoImageButton.setOnClickListener(this);
        mInfoImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v==mSearchButton){
            if (mEditTextSearch.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this, "Search Text is Required", Toast.LENGTH_LONG).show();
//                mEditTextSearch.setError("Search Text is Required");
                Toast.makeText(MainActivity.this, "Search Text is Required", Toast.LENGTH_LONG).show();
            }else {
                String searchMusic = mEditTextSearch.getText().toString();
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                //pass data with intent extras
                intent.putExtra("searchedMusic", searchMusic);
                //go to search activity
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Searching for --- " + searchMusic, Toast.LENGTH_LONG).show();
            }
        }
//        if(v==mInfoImageButton){
//            Intent intent = new Intent(MainActivity.this,AboutActivity.class);
//            startActivity(intent);
//        }
        if(v==mInfoImageView){
            Intent intent = new Intent(MainActivity.this,AboutActivity.class);
            startActivity(intent);
        }
    }


}