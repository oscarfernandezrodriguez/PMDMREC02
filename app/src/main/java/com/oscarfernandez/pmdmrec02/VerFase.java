package com.oscarfernandez.pmdmrec02;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VerFase  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verfase);
        Bundle bundle = getIntent().getExtras();
        TextView provinciaT = (TextView) findViewById(R.id.nombreP);
        provinciaT.setText(bundle.getString("provincia"));

        ImageView imagenP = (ImageView) findViewById(R.id.imagenP);

        if(provinciaT.getText().equals("A Coruña")){
            imagenP.setImageResource(R.drawable.acoruna);
        }else if(provinciaT.getText().equals("Lugo")){
            imagenP.setImageResource(R.drawable.lugo);
        }else if(provinciaT.getText().equals("Ourense")){
            imagenP.setImageResource(R.drawable.ourense);
        }else if(provinciaT.getText().equals("Pontevedra")){
            imagenP.setImageResource(R.drawable.pontevedra);
        }
    }



}
