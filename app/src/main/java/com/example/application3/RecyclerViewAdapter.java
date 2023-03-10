package com.example.application3;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<RecyclerViewItem> data;

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> data) {
        this.data = data;
        Log.d("##", "RecyclerViewAdapter: data : "+data);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        /*holder.name.setText(data.get(position).getName());
        holder.engName.setText(data.get(position).getEngName());
        holder.telNum.setText(data.get(position).getTelNum());*/

        holder.onBind(data.get(position));
        /*RecyclerViewItem item = data.get(position);
        holder.name.setText(item.getName());
        holder.engName.setText(item.getEngName());
        holder.telNum.setText(item.getTelNum());*/
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView engName;
        TextView telNum;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.d("##", "ViewHolder: ");
            name = (TextView) itemView.findViewById(R.id.name);
            engName = (TextView) itemView.findViewById(R.id.engName);
            telNum = (TextView) itemView.findViewById(R.id.telNum);
        }

        public void onBind(RecyclerViewItem item) {
            Log.d("##", "onBind: item : "+name.getText());
            name.setText(item.getName());
            engName.setText(item.getEngName());
            telNum.setText(item.getTelNum());
        }
    }
}
