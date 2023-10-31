package com.example.trialassignment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.trialassignment.R;
import com.example.trialassignment.model.ExploreModel;
import com.google.android.material.progressindicator.LinearProgressIndicator;

import java.util.ArrayList;

public class MerchantListAdapter extends RecyclerView.Adapter<MerchantListAdapter.MyViewHolder> {
    private ArrayList<ExploreModel> emplist;

    public MerchantListAdapter(ArrayList<ExploreModel> emplist) {
        this.emplist = emplist;
    }

    // This method creates a new ViewHolder object for each item in the RecyclerView
    @Override
    public MerchantListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the layout for each item and return a new ViewHolder object
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_merchant_list, parent, false);

        return new MerchantListAdapter.MyViewHolder(itemView);

    }

    // This method returns the total
    // number of items in the data set
    @Override
    public int getItemCount() {
        return emplist.size();
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    @Override
    public void onBindViewHolder(MerchantListAdapter.MyViewHolder holder, int position) {

        ExploreModel currentEmp = emplist.get(position);

        holder.name.setText(currentEmp.getName());
        holder.place.setText(currentEmp.getPlace());
        holder.linearProgressIndicator.setProgress(currentEmp.getProgress());
        holder.tvStatus.setText(currentEmp.getStatus());

    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView place;

        private TextView tvDistance;

        private LinearProgressIndicator linearProgressIndicator;
        private TextView tvPurpose;
        private TextView tvStatus;
        private TextView btnInvite;
        private ImageView ivPhoneCall;
        private ImageView ivProfile;
        private ImageView ivLocation;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            place = itemView.findViewById(R.id.tv_place);
            //tvDistance=itemView.findViewById(R.id.tv_distance);
            linearProgressIndicator=itemView.findViewById(R.id.progress_indicator);
            tvPurpose=itemView.findViewById(R.id.tv_purpose);
            tvStatus=itemView.findViewById(R.id.tv_status);
            btnInvite=itemView.findViewById(R.id.btn_invite);
            ivPhoneCall=itemView.findViewById(R.id.iv_phoneCall);
            ivProfile=itemView.findViewById(R.id.iv_profile);
            ivLocation=itemView.findViewById(R.id.iv_location);

        }

    }
}
