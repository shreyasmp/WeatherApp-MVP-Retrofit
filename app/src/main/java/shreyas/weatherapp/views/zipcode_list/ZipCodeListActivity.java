package shreyas.weatherapp.views.zipcode_list;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.test.espresso.IdlingResource;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import shreyas.weatherapp.R;
import shreyas.weatherapp.adapter.ZipCodeListAdapter;
import shreyas.weatherapp.databinding.ActivityZipCodeListBinding;
import shreyas.weatherapp.idling.EspressoIdling;
import shreyas.weatherapp.model.MainWeatherModel;
import shreyas.weatherapp.presenter.zipcode_list.ZipCodeListActions;
import shreyas.weatherapp.presenter.zipcode_list.ZipCodeListPresenter;
import shreyas.weatherapp.utils.AppConstants;
import shreyas.weatherapp.views.details.WeatherDetailActivity;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;

/**
 *  Created by shreyasmp on 4/2/18.
 *
 *  Main Activity that shows the user a edit Field and a button for enter zip code limited o 5 digits as per
 *  US zip code standards and a recycler view list that shows the pre populated zip codes in class along with
 *  user added zip codes, on click of any item on list performs the service call and shows the detail of weather
 *  in next Activity.
 */

public class ZipCodeListActivity extends AppCompatActivity implements ZipCodeListView, AppConstants {

    private static final String TAG = ZipCodeListActivity.class.getSimpleName();

    private ActivityZipCodeListBinding zipCodeListBinding;
    private ZipCodeListAdapter zipCodeListAdapter;
    private ArrayList<String> zipCodes;
    private ZipCodeListActions zipCodeListActions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        zipCodeListActions = new ZipCodeListPresenter(this);
        zipCodeListBinding = DataBindingUtil.setContentView(this, R.layout.activity_zip_code_list);

        initViews();
    }

    private void initViews() {
        zipCodeListBinding.toolbar.setTitle(getResources().getString(R.string.app_name));

        zipCodeListBinding.zipCodeList.setVisibility(View.VISIBLE);
        zipCodeListBinding.zipCodeEdit.setVisibility(View.VISIBLE);
        zipCodeListBinding.addZip.setVisibility(View.VISIBLE);
        zipCodeListBinding.progressBar.setVisibility(View.GONE);
        zipCodeListBinding.searchErrorMessage.setVisibility(View.GONE);

        zipCodes = new ArrayList<>();
        zipCodeListAdapter = new ZipCodeListAdapter(this, zipCodes, zipCodeListActions);

        zipCodes.add("76013");
        zipCodes.add("75035");
        zipCodes.add("77084");

        RecyclerView.LayoutManager lmmanager = new LinearLayoutManager(getApplicationContext());
        zipCodeListBinding.zipCodeList.setLayoutManager(lmmanager);
        DividerItemDecoration itemDecor = new DividerItemDecoration(zipCodeListBinding.zipCodeList.getContext(), VERTICAL);
        zipCodeListBinding.zipCodeList.addItemDecoration(itemDecor);

        // On click listener to add zip code to recycler view list

        zipCodeListBinding.addZip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!zipCodeListBinding.zipCodeEdit.getText().toString().isEmpty()) {
                    zipCodes.add(zipCodeListBinding.zipCodeEdit.getText().toString());
                    zipCodeListBinding.zipCodeList.setAdapter(zipCodeListAdapter);
                    zipCodeListAdapter.notifyDataSetChanged();
                    zipCodeListBinding.zipCodeEdit.setText("");
                }
            }
        });
    }

    @Override
    public void setLoader(boolean loader) {
        if (loader) {
            zipCodeListBinding.progressBar.setVisibility(View.VISIBLE);
        } else {
            zipCodeListBinding.progressBar.setVisibility(View.GONE);
        }
    }

    @Override
    public void showErrorMessage() {
        zipCodeListBinding.searchErrorMessage.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideErrorMessage() {
        zipCodeListBinding.searchErrorMessage.setVisibility(View.GONE);
    }

    /**
     *  Intent to transfer from current activity to next activity with model object
     * @param model
     */
    @Override
    public void showWeatherResults(MainWeatherModel model) {
        Intent intent = new Intent(this, WeatherDetailActivity.class);
        intent.putExtra(WEATHER_MODEL, model);
        startActivity(intent);
    }

    // resource idling for espresso to make espresso know to sync between calls

    @VisibleForTesting
    public IdlingResource getIdlingResource() {
        return EspressoIdling.getIdlingResource();
    }
}
