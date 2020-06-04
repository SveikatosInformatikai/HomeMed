package com.example.homemed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_ar_yra_simptomu extends AppCompatActivity {

    private Button buttonYra;
    private Button buttonNe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_yra_simptomu);
        buttonYra = (Button) findViewById(R.id.Button_yra);
        buttonNe = (Button) findViewById(R.id.Button_nera);
        buttonYra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityYra();

            }


        });
        buttonNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNera();
            }
        });

    }
    public void openActivityYra(){
        Intent intent = new Intent(this, Simptomu_ivedimas.class);
        startActivity(intent);
    }

    public void openActivityNera(){
        Intent intent = new Intent(this, Atsiprasymo_langas_kai_simptomu_nera.class);
        startActivity(intent);

    }
}
