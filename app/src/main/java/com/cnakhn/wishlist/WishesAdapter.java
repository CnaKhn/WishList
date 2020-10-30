package com.cnakhn.wishlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WishesAdapter extends RecyclerView.Adapter<WishesAdapter.ViewHolder> {
    private ArrayList<WishesItem> wishesItems;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wish_card, parent, false);
        return new ViewHolder(view);
    }

    public WishesAdapter(ArrayList<WishesItem> wishesItems) {
        this.wishesItems = wishesItems;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WishesItem currentItem = wishesItems.get(position);
        holder.wishImage.setImageResource(currentItem.getWishImage());
        holder.wishTitle.setText(currentItem.getWishTitle());
    }

    @Override
    public int getItemCount() {
        return wishesItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView wishImage;
        TextView wishTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            wishImage = itemView.findViewById(R.id.wish_image);
            wishTitle = itemView.findViewById(R.id.wish_title);
        }
    }
}
