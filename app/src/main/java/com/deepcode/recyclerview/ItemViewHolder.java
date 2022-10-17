package com.deepcode.recyclerview;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    //ItemViewHolder itemViewHolder = new ItemViewHolder();
    private ConstraintLayout container;
    private TextView tvVersionName;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        container = itemView.findViewById(R.id.clContainerParent);
        tvVersionName = itemView.findViewById(R.id.tvVersionName);
    }

    public void itemSet(String version, String color){
        container.setBackgroundColor(Color.parseColor(color));
        tvVersionName.setText(version);
    }

    public void changeText(String value){
        tvVersionName.setText(value);
    }
}
