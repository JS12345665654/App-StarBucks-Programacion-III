package com.example.ites22032024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CuartaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cuarta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void volversegundaactivity(View view) {
        // Crear un Intent para iniciar la siguiente Activity
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }

    public void volverloginterceraactivity(View view) {
        // Crear un Intent para iniciar la siguiente Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
