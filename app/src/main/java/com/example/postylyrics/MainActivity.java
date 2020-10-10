package com.example.postylyrics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.searchButton) Button mSearchButton;
    @BindView(R.id.editTexSearch) EditText mEditTextSearch;
//    @BindView(R.id.searchButton) Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v==mSearchButton){
            String searchMusic =mEditTextSearch.getText().toString();
            Intent intent = new Intent(MainActivity.this,SearchActivity.class);
            //pass data with intent extras
            intent.putExtra("searchMusic", searchMusic);
            //go to search activity
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Searching for --- "+searchMusic, Toast.LENGTH_LONG).show();
        }
    }


}