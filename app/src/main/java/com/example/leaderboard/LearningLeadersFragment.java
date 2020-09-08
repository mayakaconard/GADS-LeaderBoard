package com.example.leaderboard;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LearningLeadersFragment  extends Fragment {
     RecyclerView mRecycleView;
//    private  RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         v=inflater.inflate(R.layout.learning_leaders,container,false);

        ArrayList<LearningLeadersItem> learningLeaders=new ArrayList<>();
        learningLeaders.add(new LearningLeadersItem(R.drawable.top_learner,"Conard Mayaka","Kenya 20hrs" ));
        learningLeaders.add(new LearningLeadersItem(R.drawable.top_learner,"Alisha Mayaka","Kenya 30hrs" ));
        learningLeaders.add(new LearningLeadersItem(R.drawable.top_learner,"Eng. Mayaka","Kenya 50hrs" ));

        mRecycleView = (RecyclerView)v.findViewById(R.id.learning_leaders_recycleView);
        LearningLeadersAdapter viewAdapter = new LearningLeadersAdapter(learningLeaders);
        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecycleView.setHasFixedSize(true);
        mRecycleView.setAdapter(viewAdapter);
        return v;
//        mRecycleView= view.findViewById(R.id.learning_leaders_recycleView);
//        mRecycleView.setHasFixedSize(true);
//        mLayoutManager= new LinearLayoutManager(this);
//        mAdapter=new LearningLeadersAdapter(learningLeaders);
//        mRecycleView.setLayoutManager(mLayoutManager);
//        mRecycleView.setAdapter(mAdapter);

       // return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//                ArrayList<LearningLeadersItem> learningLeaders=new ArrayList<>();
//        learningLeaders.add(new LearningLeadersItem(R.drawable.top_learner,"Conard Mayaka","Kenya 20hrs" ));
//        learningLeaders.add(new LearningLeadersItem(R.drawable.top_learner,"Alisha Mayaka","Kenya 30hrs" ));
//        learningLeaders.add(new LearningLeadersItem(R.drawable.top_learner,"Eng. Mayaka","Kenya 50hrs" ));
//
//        mRecycleView=findViewById(R.id.learning_leaders_recycleView);
//        mRecycleView.setHasFixedSize(true);
//        mLayoutManager= new LinearLayoutManager(this);
//        mAdapter=new LearningLeadersAdapter(learningLeaders);
//        mRecycleView.setLayoutManager(mLayoutManager);
//        mRecycleView.setAdapter(mAdapter);

    }
}
