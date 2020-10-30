package com.cnakhn.wishlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    MaterialToolbar toolbar;
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WishesFragment()).commit();
    }

    private void initViews() {
        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        bottomNav = findViewById(R.id.main_bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    // Take care of bottom nav onClick listener
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.nav_add_wish:
                    selectedFragment = new AddWishFragment();
                    break;

                case R.id.nav_wishes:
                    selectedFragment = new WishesFragment();
                    break;

                case R.id.nav_setting:
                    selectedFragment = new SettingFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }
    };
}