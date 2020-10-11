package com.example.postylyrics;


import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AboutActivityInstrumentedTest {

    @Rule
    public ActivityTestRule<AboutActivity> activityTestRule = new ActivityTestRule<>(AboutActivity.class);

}
