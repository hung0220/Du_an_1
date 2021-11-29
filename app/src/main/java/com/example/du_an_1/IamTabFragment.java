package com.example.du_an_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class IamTabFragment extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.iam_tab_fragment);
        Menu_Nav();
    }
    public void Menu_Nav(){
        BottomNavigationView bottomNavigationView   = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Iam_fragment);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.Home_fragment:
                        startActivity(new Intent(getApplicationContext(),HomeTabFragment.class));
                        overridePendingTransition(0,0);
                        return true;
                    case  R.id.Ib_fragment:
                        startActivity(new Intent(getApplicationContext(),IbTabFragment.class));
                        overridePendingTransition(0,0);
                        return true;
                    case  R.id.Iam_fragment:
                        return true;
                }
                return false;
            }
        });
    }
}
