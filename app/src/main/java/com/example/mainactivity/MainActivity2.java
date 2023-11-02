package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView);
        String StNombre = getIntent().getStringExtra("STNombre");
        textView.setText(StNombre);

        int imagenID = getIntent().getIntExtra("ImagenID", 0); 
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(imagenID); 

    }
}
