package com.oscarfernandez.pmdmrec02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void logueo(View view) {
        Toast error;

        Intent usuarioL = new Intent(this, Usuario.class);
        Intent administradorL = new Intent(this, Administrador.class);

        Spinner tipoU = (Spinner) findViewById(R.id.tipoU);
        String tipoUT = tipoU.getSelectedItem().toString();
        EditText usuario= (EditText)findViewById(R.id.usuario);
        String usuarioT=usuario.getText().toString();
        EditText contrasena= (EditText)findViewById(R.id.contrasena);
        String contrasenaT=contrasena.getText().toString();

        if(usuarioT.equals("admin") && contrasenaT.equals("abc123.") && tipoUT.equals("Administrador")){
            administradorL.putExtra("nombre", "Administrador");
            startActivity(administradorL);
        }else if(usuarioT.equals("admin") && contrasenaT.equals("abc123.") && tipoUT.equals("Administrador") ){
            error = Toast.makeText(this, R.string.errorAU,Toast.LENGTH_LONG);
            error.show();
        }else if(usuarioT.equals("admin") && !contrasenaT.equals("abc123.") && tipoUT.equals("Administrador")){
            error = Toast.makeText(this, R.string.errorAC,Toast.LENGTH_LONG);
            error.show();
        }else if(!usuarioT.isEmpty() && !usuarioT.equals("admin") && tipoUT.equals("Usuario") ){
            usuarioL.putExtra("nombre", usuarioT);
            startActivity(usuarioL);
        }else if(!usuarioT.isEmpty() && usuarioT.equals("admin") && tipoUT.equals("Usuario") ){
            error = Toast.makeText(this, R.string.errorUA,Toast.LENGTH_LONG);
            error.show();
        }else if(usuarioT.isEmpty() && tipoUT.equals("Usuario") ){
            error = Toast.makeText(this, R.string.errorU,Toast.LENGTH_LONG);
            error.show();
        }else{
            error = Toast.makeText(this, R.string.errorL,Toast.LENGTH_LONG);
            error.show();
        }


    }
}
