package shreyas.weatherapp.espressorobot;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.contrib.RecyclerViewActions;

import shreyas.weatherapp.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by shreyasmp on 4/3/18.
 *
 * Class Robot used for creating espresso based test events that perform text match and click actions
 * The reusable components written here can be used for multiple combination of tests for each test cases
 * TDD approach is used here for the app
 */

public class Robot {

    public Robot typeInEditField(String zipcode) {
        onView(withId(R.id.zip_code_edit)).perform(typeText(zipcode),
                ViewActions.closeSoftKeyboard());
        return this;
    }

    public Robot clickAddButton() {
        onView(withId(R.id.add_zip)).perform(click());
        return this;
    }

    public Robot progressBarHidden(){
        onView(withId(R.id.progress_bar)).check(ViewAssertions.matches(not(isDisplayed())));
        return this;
    }

    public Robot errorDisplayed() {
        onView(withId(R.id.search_error_message)).check(ViewAssertions.matches(isDisplayed()));
        return this;
    }

    public Robot clickOnChildItem() {
        onView(withId(R.id.zip_code_list)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        return this;
    }
}
