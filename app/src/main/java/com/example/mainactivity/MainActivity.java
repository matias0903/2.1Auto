package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button BTAceptar;
    EditText ETNombreFoto;

    ImageView ImagenID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTAceptar = findViewById(R.id.BTAceptar);
        ETNombreFoto = findViewById(R.id.ETNombreFoto);
        ImagenID = findViewById(R.id.ImagenID);

        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String StNombre = ETNombreFoto.getText().toString();
                int imagenID = R.drawable.subaruwrx;
                Intent sIntent = new Intent(MainActivity.this, MainActivity2.class);
                sIntent.putExtra("STNombre", StNombre);
                sIntent.putExtra("ImagenID", imagenID);
                startActivity(sIntent);
            }
        });

    }
}
