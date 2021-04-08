package com.productive6.productive.ui;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.productive6.productive.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SortingTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void sortingTest() {
        ViewInteraction bottomNavigationItemView = onView(
                allOf(withId(R.id.navigation_todo), withContentDescription("To-do"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_view),
                                        0),
                                1),
                        isDisplayed()));
        bottomNavigationItemView.perform(click());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.newTaskButton), withText("Add Task"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                7),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.taskNameForm),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.textInputLayout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("Task1"), closeSoftKeyboard());

        ViewInteraction switchCompat = onView(
                allOf(withId(R.id.switchDeadline), withText("Deadline"),
                        childAtPosition(
                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                4),
                        isDisplayed()));
        switchCompat.perform(click());

        ViewInteraction materialRadioButton = onView(
                allOf(withId(R.id.highButton), withText("High"),
                        childAtPosition(
                                allOf(withId(R.id.priorityGroup),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                6)),
                                0),
                        isDisplayed()));
        materialRadioButton.perform(click());

        ViewInteraction materialRadioButton2 = onView(
                allOf(withId(R.id.hardButton), withText("Hard"),
                        childAtPosition(
                                allOf(withId(R.id.difficultyGroup),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                7)),
                                0),
                        isDisplayed()));
        materialRadioButton2.perform(click());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.submit), withText("Submit"),
                        childAtPosition(
                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                1),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.newTaskButton), withText("Add Task"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                7),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.taskNameForm),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.textInputLayout),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("Task2"), closeSoftKeyboard());

        ViewInteraction materialRadioButton3 = onView(
                allOf(withId(R.id.lowButton), withText("Low"),
                        childAtPosition(
                                allOf(withId(R.id.priorityGroup),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                6)),
                                2),
                        isDisplayed()));
        materialRadioButton3.perform(click());

        ViewInteraction materialRadioButton4 = onView(
                allOf(withId(R.id.easyButton), withText("Easy"),
                        childAtPosition(
                                allOf(withId(R.id.difficultyGroup),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                7)),
                                2),
                        isDisplayed()));
        materialRadioButton4.perform(click());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.submit), withText("Submit"),
                        childAtPosition(
                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                1),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction imageView = onView(
                allOf(withParent(allOf(withId(R.id.constraintLayout),
                        withParent(withId(R.id.taskDisplayView)))),
                        isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction imageView2 = onView(
                allOf(withParent(allOf(withId(R.id.constraintLayout),
                        withParent(withId(R.id.taskDisplayView)))),
                        isDisplayed()));
        imageView2.check(matches(isDisplayed()));

        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.sortTasksDropdown),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                2),
                        isDisplayed()));
        appCompatSpinner.perform(click());

        DataInteraction materialTextView = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(1);
        materialTextView.perform(click());

        ViewInteraction appCompatSpinner2 = onView(
                allOf(withId(R.id.sortTasksDropdown),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                2),
                        isDisplayed()));
        appCompatSpinner2.perform(click());

        DataInteraction materialTextView2 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(2);
        materialTextView2.perform(click());

        ViewInteraction appCompatSpinner3 = onView(
                allOf(withId(R.id.sortTasksDropdown),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                2),
                        isDisplayed()));
        appCompatSpinner3.perform(click());

        DataInteraction materialTextView3 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(0);
        materialTextView3.perform(click());

        ViewInteraction appCompatSpinner4 = onView(
                allOf(withId(R.id.sortTasksDropdown),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                2),
                        isDisplayed()));
        appCompatSpinner4.perform(click());

        DataInteraction materialTextView4 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(2);
        materialTextView4.perform(click());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.taskCompleteToggleButton),
                        childAtPosition(
                                allOf(withId(R.id.constraintLayout),
                                        childAtPosition(
                                                withId(R.id.taskDisplayView),
                                                0)),
                                6),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.taskCompleteToggleButton),
                        childAtPosition(
                                allOf(withId(R.id.constraintLayout),
                                        childAtPosition(
                                                withId(R.id.taskDisplayView),
                                                0)),
                                6),
                        isDisplayed()));
        materialButton6.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
