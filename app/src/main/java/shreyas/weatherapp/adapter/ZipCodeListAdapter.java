package shreyas.weatherapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import shreyas.weatherapp.R;
import shreyas.weatherapp.presenter.zipcode_list.ZipCodeListActions;

/**
 * Created by shreyasmp on 4/2/18.
 *
 *  Custom adapter which extends recycler view for showing added zip codes from edit field using Viewholder pattern
 */

public class ZipCodeListAdapter extends RecyclerView.Adapter<ZipCodeListAdapter.ViewHolder> {

    private static final String TAG = ZipCodeListAdapter.class.getSimpleName();

    private Context context;
    private ArrayList<String> zipCode;
    private ZipCodeListActions zipCodeListActions;

    public ZipCodeListAdapter(Context context, ArrayList<String> zipCodeList, ZipCodeListActions zipCodeListActions) {
        this.context = context;
        this.zipCode = zipCodeList;
        this.zipCodeListActions = zipCodeListActions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zip_code_single_list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.listItem.setText(zipCode.get(position));
        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zipCodeListActions.searchWeatherDetailForZip(zipCode.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return zipCode == null ? 0 : zipCode.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView listItem;
        public LinearLayout itemLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            listItem = itemView.findViewById(R.id.zip_code_list_item);
            itemLayout = itemView.findViewById(R.id.zip_code_single_item_layout);
        }
    }
}
