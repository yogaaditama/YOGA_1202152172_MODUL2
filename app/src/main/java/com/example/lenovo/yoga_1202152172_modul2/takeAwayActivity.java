package com.example.lenovo.yoga_1202152172_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class takeAwayActivity extends AppCompatActivity {
Button Pesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        Pesanan = (Button)findViewById(R.id.pesan);

        Pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(takeAwayActivity.this, daftarMejaActivity.class);
                startActivity(intent);
            }
        });
    }
}
