package com.example.asus.senjatakhasindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSenjata;
    private ArrayList<Senjata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSenjata = findViewById(R.id.rv_senjata);
        rvSenjata.setHasFixedSize(true);

        list.addAll(SenjataData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void viewAbout(MenuItem mi){
        Toast.makeText(this, "Selected item: " + mi.getTitle(), Toast.LENGTH_SHORT).show();
        Intent s = new Intent(MainActivity.this, About.class);
        startActivity(s);
    }

    private void showRecyclerList(){
        rvSenjata.setLayoutManager(new LinearLayoutManager(this));
        ListSenjataAdapter listSenjataAdapter = new ListSenjataAdapter(this);
        listSenjataAdapter.setListSenjata(list);
        rvSenjata.setAdapter(listSenjataAdapter);
    }
}
