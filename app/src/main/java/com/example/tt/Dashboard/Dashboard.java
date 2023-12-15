package com.example.tt.Dashboard;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tt.R;

public class Dashboard extends AppCompatActivity {

    View bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_home);

        bottomNavigationView = findViewById(R.id.BottomNavigation_home);

        bottomNavigationView.setBackgroundTintList(null);

        final Home_page_dashboard homePage = new Home_page_dashboard();
        final Setting setting_page= new Setting();
        final Vehcile Vehcile_page = new Vehcile();

        setCurrentFragment(homePage);

        bottomNavigationView.setOnContextClickListener( v -> {

                    if (v.getId() == R.id.ghar_home) {
                        setCurrentFragment(homePage);
                    }
                    else if (v.getId() == R.id.Setting_icon) {
                        setCurrentFragment(setting_page);
                    }
                    else if (v.getId() == R.id.Vehicle_icon) {
                        setCurrentFragment(Vehcile_page);
                    }
                    return true;
                });
    }

    private void setCurrentFragment(Fragment fragment) {
                 getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragment, fragment)
                .commit();
    }
}