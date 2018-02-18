package com.example.lenovo.yoga_1202152172_modul2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class daftarMejaActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a, b;

    private ImageView image;
    //judul
    private String[] Judulmenu = {
            "Soto",
            "Nasi Goreng",
            "Nasi Padang",
            "Nasi Uduk",
            "Opor Ayam",
            "Rawon",
            "Sate"};

    private String[] HargaM = {
            "Rp.50.000",
            "Rp.10.000",
            "Rp.19.000",
            "Rp.12.000",
            "Rp.15.000",
            "Rp.20.000",
            "Rp.14.000"};
    //Daftar Gambar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_meja);

        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.Rview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);
    }
    private void DaftarItem() {
        for (int w = 0; w < Judulmenu.length; w++) {
            dataMenu.add(Judulmenu[w]);
            dataHarga.add(HargaM[w]);

        }
    }
}
