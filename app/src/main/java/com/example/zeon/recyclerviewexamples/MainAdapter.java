package com.example.zeon.recyclerviewexamples;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zeon on 15/8/2559.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new ViewItemGroup(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.viewItemGroup.setTextWithListener("Position : " + (position+1), position);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {

        private ViewItemGroup viewItemGroup;

        public ViewHolder(View itemView) {
            super(itemView);
            viewItemGroup = (ViewItemGroup) itemView;
        }
    }
}
