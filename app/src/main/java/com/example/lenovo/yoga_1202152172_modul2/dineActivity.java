package com.example.lenovo.yoga_1202152172_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class dineActivity extends AppCompatActivity {
    Button btbutton;
    Spinner spinner;
    private String [] labels_array = {"MEJA 1", "MEJA 2", "MEJA 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine);
        btbutton = (Button)findViewById(R.id.pilih);
        spinner = (Spinner)findViewById(R.id.meja);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, labels_array);
        spinner.setAdapter(adapter);

        Toast.makeText(getApplicationContext(),"DINE IN", Toast.LENGTH_LONG).show();

        btbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dineActivity.this, daftarMejaActivity.class);
                startActivity(intent);
            }
        });


    }
}
