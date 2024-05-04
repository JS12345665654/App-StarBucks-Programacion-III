package com.example.ites22032024;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        Button btnenviarcorreo = findViewById(R.id.btnenviarcorreo);
        btnenviarcorreo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:joaquinsobeperez@gmail.com"));
                startActivity(intent);
            }
        });

        Button btnllamar = findViewById(R.id.btnllamar);
        btnllamar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+54 2954-518184"));
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void acercade(View view) {

            // Crear un Intent para iniciar la siguiente Activity
            Intent intent = new Intent(this, CuartaActivity.class);
            startActivity(intent);
    }

    public void salirlogin(View view) {

        // Crear un Intent para iniciar la siguiente Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}