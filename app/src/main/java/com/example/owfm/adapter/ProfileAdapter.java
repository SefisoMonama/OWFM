package com.example.owfm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.owfm.Entities.Profile;
import com.example.owfm.R;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.viewHolder>{

    Context context;
    List<Profile> list;

    public ProfileAdapter(Context context, List<Profile> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_app_logs, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.applog.setText(list.get(position).getUsername());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{

        TextView applog;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            applog = itemView.findViewById(R.id.appLogs_textView);

        }
    }

}
