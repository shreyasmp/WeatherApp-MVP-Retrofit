package shreyas.weatherapp.runner;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import shreyas.weatherapp.espressorobot.Robot;
import shreyas.weatherapp.views.zipcode_list.ZipCodeListActivity;

import static android.support.test.espresso.Espresso.registerIdlingResources;

/**
 * Created by shreyasmp on 4/3/18.
 * <p>
 * Class to run UI Tests on the app, with TDD approach used for developing this app.
 * Have made use of reusable test events from Robot class for performing various tests.
 * Since there is a overhead of network call, Espresso has to be informed to sync actions
 * when performing tests
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class RunTest {

    @Rule
    public IntentsTestRule<ZipCodeListActivity> searchZipCodeActivityTestRule =
            new IntentsTestRule<>(ZipCodeListActivity.class);

    private Robot robo = new Robot();

    // Register the idling resource before start of tests
    @Before
    public void registerResource() {
        registerIdlingResources(searchZipCodeActivityTestRule.getActivity().getIdlingResource());
    }

    @SmallTest
    public void initialScreenShow() {
        robo.progressBarHidden();
    }

    @Test
    public void enterZipCode() {
        robo
                .typeInEditField("97035")
                .clickAddButton()
                .clickOnChildItem();
    }

    @Test
    public void enterZipCodeOne() {
        robo
                .typeInEditField("98125")
                .clickAddButton()
                .clickOnChildItem();
    }

    // Unregister the idling resource after tests

    @After
    public void unRegisterIdlingResource() {
        Espresso.unregisterIdlingResources(searchZipCodeActivityTestRule.getActivity().getIdlingResource());
    }
}
