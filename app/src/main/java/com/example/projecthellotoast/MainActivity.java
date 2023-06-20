package com.example.projecthellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button botonToast = findViewById(R.id.buttonShowToast);
        Button botonCounter = findViewById(R.id.buttonCount);
        TextView texto = findViewById(R.id.textResultado);

        botonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });
        botonCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero = Integer.parseInt(texto.getText().toString());
                numero++;
                texto.setText(numero.toString());
            }
        });
    }
}