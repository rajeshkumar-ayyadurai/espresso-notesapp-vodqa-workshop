package com.thoughtworks.notesvodqa

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.endsWith
import org.hamcrest.core.AllOf.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NotesAppSampleTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun viewMatcherExample() {
        onView(withId(R.id.add_new_notes))
    }

    @Test
    fun viewActionsExample() {
        onView(withId(R.id.add_new_notes)).perform(click())
    }

    @Test
    fun viewAssertionsExample() {
        onView(withId(R.id.add_new_notes)).check(matches(isDisplayed()))
    }

    @Test
    fun espressoBuildingBlocksExample() {
        onView(withId(R.id.add_new_notes)).check(matches(isDisplayed())).perform(click())
        // onView(withId(R.id.add_new_notes)).perform(click()).check(matches(isDisplayed()))
    }

    @Test // assignment
    fun verifyAddNotesButtonIsClickable() {
        onView(withId(R.id.add_new_notes)).check(matches(isClickable()))
    }

    @Test
    fun verifyBottomTabSelection() {
        val notesTab = onView(
            allOf(
                isDescendantOfA(withId(R.id.nav_view)),
                withId(com.google.android.material.R.id.navigation_bar_item_large_label_view),
                withText("Notes")
            )
        )
        notesTab.check(matches(isSelected()))
        onView(withContentDescription("Profile")).check(matches(isNotSelected()))
    }

    @Test
    fun addNewNotesAndSave() {
        onView(withId(R.id.add_new_notes)).perform(click())
        val addNotesTextEdit = onView(withId(R.id.add_notes_dialog_edit_text))
        addNotesTextEdit.perform(typeText("vodqa mega event 2022"))
                        .perform(clearText())
                        .perform(typeText("vodqa mega event 2023"))
        onView(withId(R.id.add_notes_dialog)).perform(click())
        onView(withId(R.id.notes_list_view)).perform(swipeUp())
        onView(withText(endsWith("event 2023"))).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

}