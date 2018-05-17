package com.example.arnoldo.patronfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtConexion;
Button btnAccion;
TextView tvMostrar;

Factory miFactory; //instancio la clase y creo una variable local para hacer so de ella
Conexion miConexion;//de igual manera ..aqui tengo las validaciones de las conexiones existentes
    @Override//es la masrca de que es un metodo sobre escrito heredado de una clase padre
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMostrar=findViewById(R.id.tvMostrar);
        edtConexion=findViewById(R.id.edtConexion);// asocio el texto de la interfaz a variables locales de la clase
        btnAccion=findViewById(R.id.btnAccion);
        btnAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Tipo=edtConexion.getText().toString();//tomo el dato y lo guardo en la variable tipo
                miFactory=new Factory(Tipo);//le paso el parametro a la clase factory
                miConexion=miFactory.creaConexion();//la conexion va a ser igual
                //a lo el tipo que mande desde la consola
                String resultados=miConexion.descripcion();
                tvMostrar.setText(resultados);
               // Toast.makeText(MainActivity.this, "Estas conectado a" + resultados, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
