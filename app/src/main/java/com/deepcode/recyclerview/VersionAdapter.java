package com.deepcode.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VersionAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    //Criar ArrayList para receber um conjunto de strings
    private ArrayList<String> versionNameList = new ArrayList<String>();
    private String[] colors;

    //Adicionar o conteúdo do ArrayList a minha classe
    public void setVersionNameList(ArrayList<String> versionNameList, String[] colors) {
        this.versionNameList.addAll(versionNameList);
        this.colors = colors;
    }

    public String getColor(int position){
        return colors[position];
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        ItemViewHolder ivHolder = new ItemViewHolder(view);
        return ivHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        //String versionName = this.versionNameList.get(position);
        //holder.changeText(versionName);

        holder.itemSet(this.versionNameList.get(position),colors[position]);

    }

    @Override
    public int getItemCount() {
        return versionNameList.size();
    }
}
