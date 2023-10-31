package com.example.trialassignment.adapter;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.trialassignment.R;
import com.example.trialassignment.model.ExploreModel;
import com.google.android.material.progressindicator.LinearProgressIndicator;

import java.util.ArrayList;

public class ExploreListAdapter extends RecyclerView.Adapter<ExploreListAdapter.MyViewHolder> {

    private ArrayList<ExploreModel> emplist;

    public ExploreListAdapter(ArrayList<ExploreModel> emplist) {
        this.emplist = emplist;
    }

    // This method creates a new ViewHolder object for each item in the RecyclerView
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the layout for each item and return a new ViewHolder object
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_list, parent, false);

        return new MyViewHolder(itemView);

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
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ExploreModel currentEmp = emplist.get(position);


        holder.name.setText(currentEmp.getName());
        holder.place.setText(currentEmp.getPlace());
        holder.tvDistance.setText(currentEmp.getDistance());
        holder.linearProgressIndicator.setProgress(currentEmp.getProgress());

        holder.tvPurpose.setText(currentEmp.getPurpose());
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
        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            place = itemView.findViewById(R.id.tv_place);
            tvDistance=itemView.findViewById(R.id.tv_distance);
            linearProgressIndicator=itemView.findViewById(R.id.progress_indicator);
            tvPurpose=itemView.findViewById(R.id.tv_purpose);
            tvStatus=itemView.findViewById(R.id.tv_status);
            btnInvite=itemView.findViewById(R.id.btn_invite);
        }

    }
}
