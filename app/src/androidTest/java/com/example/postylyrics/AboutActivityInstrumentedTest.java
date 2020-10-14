package com.example.postylyrics;


import android.view.View;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.postylyrics.ui.AboutActivity;

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
public class AboutActivityInstrumentedTest {

    @Rule
    public ActivityTestRule<AboutActivity> activityTestRule = new ActivityTestRule<>(AboutActivity.class);

    @Test
    public void listItemClickDisplaysToastWithCorrectAboutItem() {
        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
        String testAboutListItem = "Follow us on LinkedIn";
//        String testAboutListItem2 = "Follow us on YouTube";
        onData(anything())
                .inAdapterView(withId(R.id.aboutListView))
                .atPosition(0)
//                .atPosition(1)
                .perform(click());
        onView(withText(testAboutListItem)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(testAboutListItem)));
//        onView(withText(testAboutListItem2)).inRoot(withDecorView(not(activityDecorView)))
//                .check(matches(withText(testAboutListItem2)));
    }

}
