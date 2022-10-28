package za.co.owfm.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.owfm.Entities.Asset;

import com.example.owfm.R;

import java.util.List;


public class AssetAdapter extends RecyclerView.Adapter<AssetAdapter.viewHolder>{

    Context context;
    List<Asset> list;

    public AssetAdapter(Context context, List<Asset> list) {
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
        holder.applog.setText(list.get(position).getCiName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{

        TextView applog;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }

}