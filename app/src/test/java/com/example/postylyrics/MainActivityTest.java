package com.example.postylyrics;

import android.content.Intent;
import android.os.Build;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static org.junit.Assert.assertTrue;


@RunWith(RobolectricTestRunner.class)
//@Config(manifest=Config.NONE)
@Config(sdk = Build.VERSION_CODES.O_MR1)        //edit fix
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

//    @Test
//    public void TextViewContent() {
//        TextView textIntro = activity.findViewById(R.id.mainTextView);
////        assertTrue("PostyLyrics \\n Instant Lyrics Search".equals(textIntro.getText().toString()));
//        assertTrue(textIntro.getText().toString().equals(R.string.postylyrics_n_instant_lyrics_search));
//    }

    @Test
    public void aboutActivityStarted(){
        activity.findViewById(R.id.infoImageView).performClick();
        Intent expectedIntent = new Intent(activity, AboutActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }

//    @Test
//    public void searchActivityStarted(){
//        activity.findViewById(R.id.searchButton).performClick();
//        Intent expectedIntent = new Intent(activity, SearchActivity.class);
//        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
//        Intent actualIntent = shadowActivity.getNextStartedActivity();
//        assertTrue(actualIntent.filterEquals(expectedIntent));
//    }

}
