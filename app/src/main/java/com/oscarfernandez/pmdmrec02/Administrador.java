package com.oscarfernandez.pmdmrec02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Administrador  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
    }

    public void engadirFase(View view) {
        Intent engadirFase = new Intent(this, EngadirFase.class);
        startActivity(engadirFase);
    }

    public void seleccionarFase(View view) {
        Intent seleccionarFase = new Intent(this, SeleccionarFase.class);
        startActivity(seleccionarFase);
    }

}
