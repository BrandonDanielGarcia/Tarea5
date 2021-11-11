package mx.edu.tesoem.isc.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Convertir(View view){
        TextView result1 = findViewById(R.id.result);
        EditText nombre1 = findViewById(R.id.nombre);
        EditText correo1 = findViewById(R.id.correo);
        EditText edad1 = findViewById(R.id.edad);
        EditText telefono1 = findViewById(R.id.telefono);
        EditText curp1 = findViewById(R.id.curp);
        EditText estado1 = findViewById(R.id.estado);
        String nombre2 = nombre1.getText().toString();
        String correo2 = correo1.getText().toString();
        String edad2 = edad1.getText().toString();
        String telefono2 = telefono1.getText().toString();
        String curp2 = curp1.getText().toString();
        String estado2 = estado1.getText().toString();
        Datos datos = new Datos(nombre2, correo2, telefono2, edad2, curp2, estado2);
        Gson gson = new Gson();
        result1.setText(gson.toJson(datos));
    }
}