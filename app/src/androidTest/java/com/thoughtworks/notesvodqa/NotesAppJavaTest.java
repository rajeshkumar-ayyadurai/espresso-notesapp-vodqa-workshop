package com.thoughtworks.notesvodqa;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NotesAppJavaTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addNote(){
        onView(withId(R.id.add_new_notes))
                .perform(click());

        onView(withId(R.id.add_notes_dialog))
                .check(matches(isDisplayed()));

        onView(withId(R.id.add_notes_dialog_edit_text))
                .perform(typeText("Guru"), closeSoftKeyboard());

        onView(withId(R.id.add_notes_dialog))
                .perform(click());
    }
}
