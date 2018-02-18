package com.example.lenovo.yoga_1202152172_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailMenu extends AppCompatActivity {
    private TextView tvnama,tvharga,tvkomposisi;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        tvnama = (TextView) findViewById(R.id.nama);

        tvharga= (TextView) findViewById(R.id.harga);

        tvkomposisi = (TextView) findViewById(R.id.komposisi);

        image = (ImageView) findViewById(R.id.imageView4);

        Intent c = getIntent();
        String menu = c.getStringExtra("judul");
        String hrga = c.getStringExtra("harga");
        String kmposisi= c.getStringExtra("komposisi");
        Integer gmbr = c.getIntExtra("gambar",0);

        tvnama.setText(menu);
        tvharga.setText(hrga);
        tvkomposisi.setText(kmposisi);
        image.setImageResource(gmbr);
    }
}
