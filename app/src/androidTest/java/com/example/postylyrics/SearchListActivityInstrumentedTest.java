package com.example.postylyrics;


import android.view.View;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SearchListActivityInstrumentedTest {

    @Rule
    public ActivityTestRule<SearchListActivity> activityTestRule = new ActivityTestRule<>(SearchListActivity.class);

    @Test
    public void listItemClickDisplaysToastWithCorrectLyricSearchedItem() {
        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
//        String lyricsResultTest = "Song 1 Lyrics";
        String lyricsResultTestTwo = "Song 2 Lyrics";
        onData(anything())
                .inAdapterView(withId(R.id.tracksListView))
//                .atPosition(0)
                .atPosition(1)
                .perform(click());
//        onView(withText(lyricsResultTest)).inRoot(withDecorView(not(activityDecorView)))
//                .check(matches(withText(lyricsResultTest)));
        onView(withText(lyricsResultTestTwo)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(lyricsResultTestTwo)));
    }

}

