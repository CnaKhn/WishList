package com.cnakhn.wishlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WishesFragment extends Fragment {
    private RecyclerView rvWishes;
    private RecyclerView.Adapter adapter;
    ArrayList<WishesItem> wishesItems;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wishesItems = new ArrayList<>();
        wishesItems.add(new WishesItem(R.drawable.banner, "Wish 1"));
        wishesItems.add(new WishesItem(R.drawable.banner_2, "Wish 2"));
        wishesItems.add(new WishesItem(R.drawable.banner_3, "Wish 3"));
        wishesItems.add(new WishesItem(R.drawable.banner, "Wish 1"));
        wishesItems.add(new WishesItem(R.drawable.banner_2, "Wish 2"));
        wishesItems.add(new WishesItem(R.drawable.banner_3, "Wish 3"));
        wishesItems.add(new WishesItem(R.drawable.banner, "Wish 1"));
        wishesItems.add(new WishesItem(R.drawable.banner_2, "Wish 2"));
        wishesItems.add(new WishesItem(R.drawable.banner_3, "Wish 3"));
        wishesItems.add(new WishesItem(R.drawable.banner, "Wish 1"));
        wishesItems.add(new WishesItem(R.drawable.banner_2, "Wish 2"));
        wishesItems.add(new WishesItem(R.drawable.banner_3, "Wish 3"));
        wishesItems.add(new WishesItem(R.drawable.banner, "Wish 1"));
        wishesItems.add(new WishesItem(R.drawable.banner_2, "Wish 2"));
        wishesItems.add(new WishesItem(R.drawable.banner_3, "Wish 3"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wishes, container, false);
        rvWishes = view.findViewById(R.id.rv_wishes);
        initRecyclerView(wishesItems);
        return view;
    }

    private void initRecyclerView(ArrayList<WishesItem> wishesItems) {
        adapter = new WishesAdapter(wishesItems);
        rvWishes.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rvWishes.setHasFixedSize(true);
        rvWishes.setAdapter(adapter);
    }
}
