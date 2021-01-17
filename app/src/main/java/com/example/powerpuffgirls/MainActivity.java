package com.example.powerpuffgirls;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        //        openFragment(RecommendationsActivity.newInstance("", ""));
    }
    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            item -> {
                switch (item.getItemId()) {
                    case R.id.home_icon:
//                            openFragment(HomeFragment.newInstance("", ""));
//                            return true;
                    case R.id.resources_icon:
                        openFragment(RecommendationsFragment.newInstance());
//                              Intent i = new Intent(MainActivity.this, RecommendationsActivity.class);
//                              startActivity(i);
                        return true;
                    case R.id.user_icon:
//                            openFragment(NotificationFragment.newInstance("", ""));
//                            return true;
                }
                return false;
            };
}
