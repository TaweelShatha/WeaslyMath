package com.example.weaslymath;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHolder> {

    private ArrayList<Score> ScoreArrayList;
    private Context context;


    public ScoreAdapter(ArrayList<Score> courseModalArrayList, Context context) {
        this.ScoreArrayList = ScoreArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ScoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.score, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScoreAdapter.ViewHolder holder, int position) {
        Score modal = ScoreArrayList.get(position);
        holder.Time.setText(Math.toIntExact(modal.getTime()));
        holder.Score.setText(modal.getScore());
    }

    @Override
    public int getItemCount() {
        return ScoreArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView Time, Score;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // initializing our views with their ids.
            Time = itemView.findViewById(R.id.time);
            Score = itemView.findViewById(R.id.score);
        }
    }
}