package com.example.miscoordenadas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BuscarRutaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buscar_ruta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void BuscarRuta1 (View view){
        Intent BuscarRuta1 = new Intent ( this, MainActivity.class);
        startActivities(new Intent[]{BuscarRuta1});
    }
    public void BuscarRuta2 (View view){
        Intent BuscarRuta2 = new Intent ( this, Ruta2Activity.class);
        startActivities(new Intent[]{BuscarRuta2});
    }
}