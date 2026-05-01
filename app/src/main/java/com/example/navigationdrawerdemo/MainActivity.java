package com.example.navigationdrawerdemo;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.navigationdrawerdemo.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration maConfigurationNav;
    private ActivityMainBinding maLiaisonIHM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        maLiaisonIHM = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(maLiaisonIHM.getRoot());

        setSupportActionBar(maLiaisonIHM.appBarMain.toolbar);
        maLiaisonIHM.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Remplacez par votre propre action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout monMenuLateral = maLiaisonIHM.drawerLayout;
        NavigationView maVueNav = maLiaisonIHM.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        maConfigurationNav = new AppBarConfiguration.Builder(
                R.id.nav_fragment1, R.id.nav_fragment2, R.id.nav_list)
                .setOpenableLayout(monMenuLateral)
                .build();
        
        NavHostFragment monFragmentHote = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_content_main);
        NavController monControleurNav = monFragmentHote.getNavController();
        
        NavigationUI.setupActionBarWithNavController(this, monControleurNav, maConfigurationNav);
        NavigationUI.setupWithNavController(maVueNav, monControleurNav);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavHostFragment monFragmentHote = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_content_main);
        NavController monControleurNav = monFragmentHote.getNavController();
        return NavigationUI.navigateUp(monControleurNav, maConfigurationNav)
                || super.onSupportNavigateUp();
    }
}
