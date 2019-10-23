package com.example.asus.senjatakhasindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MoveToDetail extends AppCompatActivity {

    TextView senjata, deskripsi;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.move_to_detail);

        senjata = findViewById(R.id.senjata);
        deskripsi = findViewById(R.id.detail);
        image = findViewById(R.id.photo);

        Intent s = getIntent();

        String nama = s.getStringExtra("nama");
        String detail = s.getStringExtra("detail");
        int gambar = s.getExtras().getInt("photo");

        senjata.setText(nama);
        deskripsi.setText(detail);
        image.setImageResource(gambar);
    }
}
