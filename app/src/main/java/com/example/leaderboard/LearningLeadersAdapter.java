package com.example.leaderboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LearningLeadersAdapter extends RecyclerView.Adapter<LearningLeadersAdapter.LeadersViewHolder> {

private ArrayList<LearningLeadersItem> mLeadersList;

    public static class LeadersViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public LeadersViewHolder(View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.imageView);
            mTextView1=itemView.findViewById(R.id.full_name);
            mTextView2=itemView.findViewById(R.id.hours_engaged);
        }
    }
   public LearningLeadersAdapter (ArrayList<LearningLeadersItem> leadersList){
        mLeadersList=leadersList;
   }
    @Override
    public LeadersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.learning_leaders_item, parent ,false);
        LeadersViewHolder lvh=new LeadersViewHolder(v);
        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull LeadersViewHolder holder, int position) {
        LearningLeadersItem currentItem=mLeadersList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getFullName());
        holder.mTextView2.setText(currentItem.getHoursEngaged());
    }

    @Override
    public int getItemCount() {
        return mLeadersList.size();
    }



}