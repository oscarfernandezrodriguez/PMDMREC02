package com.oscarfernandez.pmdmrec02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Usuario extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        Bundle bundle = getIntent().getExtras();
        TextView NombreT = (TextView) findViewById(R.id.nombre);
        NombreT.setText("Usuario");
    }

    public void verFase(View view) {
        Intent fases = new Intent(this, VerFase.class);
        Spinner provinciaS = (Spinner) findViewById(R.id.provinciaS);
        String provinciaT = provinciaS.getSelectedItem().toString();
        fases.putExtra("provincia",provinciaT);
        startActivity(fases);
    }

    public void sair(View view) {
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }


}
