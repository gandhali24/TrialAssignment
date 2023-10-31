package com.example.trialassignment.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trialassignment.R;
import com.example.trialassignment.adapter.ExploreListAdapter;
import com.example.trialassignment.constant.Constants;
import com.example.trialassignment.model.ExploreModel;

import java.util.ArrayList;


public class PersonalFragment extends Fragment {

    public PersonalFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal, container, false);
    }

    @Override
    public void onViewCreated(View view,
                              Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        // getting the employeelist
        ArrayList<ExploreModel> personalList
                = Constants.getPersonalData();

        // Assign employeelist to ItemAdapter
        ExploreListAdapter itemAdapter = new ExploreListAdapter(personalList);

        // Set the LayoutManager that
        // this RecyclerView will use.
        RecyclerView recyclerView
                = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext()));

        // adapter instance is set to the
        // recyclerview to inflate the items.
        recyclerView.setAdapter(itemAdapter);
    }
}