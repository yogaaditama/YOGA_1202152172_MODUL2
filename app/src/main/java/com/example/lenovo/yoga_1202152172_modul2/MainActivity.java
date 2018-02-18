package com.example.lenovo.yoga_1202152172_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup radioGroup;
RadioButton radioButton,radioButton2;
Button btnpesan;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "YOGA_1202152172", Toast.LENGTH_SHORT).show();
        radioButton = (RadioButton)findViewById(R.id.dine);
        radioButton2 = (RadioButton)findViewById(R.id.take);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        btnpesan = (Button)findViewById(R.id.pesan);
        textView = (TextView )findViewById(R.id.textView);

        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selctedIid = radioGroup.getCheckedRadioButtonId();
                if (selctedIid == radioButton.getId()){
                    Intent Rdine = new Intent(MainActivity.this, dineActivity.class);
                    startActivity(Rdine);

                }if (selctedIid == radioButton2.getId()){
                    Intent Rtake = new Intent(MainActivity.this, takeAwayActivity.class);
                    startActivity(Rtake);

                }
            }
        });
    }

}