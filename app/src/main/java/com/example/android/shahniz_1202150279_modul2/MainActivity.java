package com.example.android.shahniz_1202150279_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioGroup radiog;
    RadioButton bdinein, btakeaway;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonpesan);
        radiog = findViewById(R.id.rgroup);
        bdinein = findViewById(R.id.dinein);
        btakeaway = findViewById(R.id.takeaway);


        Toast.makeText(this, "SHAHNIZ_1202150279", Toast.LENGTH_LONG).show();


        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Check which radio button was clicked
                        switch (radiog.getCheckedRadioButtonId()) {
                            case R.id.dinein:
                                    Toast.makeText(getBaseContext(), "Dine In", Toast.LENGTH_LONG).show();
                                    Intent d = new Intent(getApplicationContext(), DineIn.class);
                                    startActivity(d);
                                    break;
                            case R.id.takeaway:
                                    Toast.makeText(getBaseContext(), "Take Away", Toast.LENGTH_LONG).show();
                                    Intent t = new Intent(getApplicationContext(), TakeAway.class);
                                    startActivity(t);
                                    break;
                        }
                    }

                }
        );
    }
}
