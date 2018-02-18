package com.example.android.shahniz_1202150279_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeAway extends AppCompatActivity {
    private Button buttonpsn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        buttonpsn = findViewById(R.id.button2);

        buttonpsn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent a = new Intent(getApplicationContext(), DaftarMenu.class);
                        startActivity(a);
                    }
                }
        );
    }


}
