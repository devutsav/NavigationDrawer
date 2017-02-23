package com.example.utsav.navigationdrawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout draw;
    private ActionBarDrawerToggle abdtoggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        draw=(DrawerLayout)findViewById(R.id.drawerLayout);
        abdtoggle=new ActionBarDrawerToggle(this,draw,R.string.open,R.string.close);

        draw.addDrawerListener(abdtoggle);
        abdtoggle.syncState();
        try {
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }
        catch(Exception e){}

    }

}
