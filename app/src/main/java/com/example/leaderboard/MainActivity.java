package com.example.leaderboard;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.leaderboard.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public RecyclerView mRecycleView;
    private  RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

//        ArrayList<LearningLeadersItem> learningLeaders=new ArrayList<>();
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


